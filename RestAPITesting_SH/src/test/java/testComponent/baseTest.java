package testComponent;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.RestAssured;
import io.restassured.response.Response;

// Keep checking the imports that has been added here are not depricated
public class baseTest {

	// To maintain privacy and security protected the Variables inside the class
    protected JSONObject requestPayload;
    protected JSONObject assertions;
    protected String url;

    public void readJson(String filePath) throws IOException, ParseException { // Parse the Json and read it,extract the keys as request,assertion.
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader(filePath);
        JSONObject jsonObject = (JSONObject) parser.parse(reader);
        JSONObject request = (JSONObject) jsonObject.get("request");
        url = (String) request.get("url");
        requestPayload = (JSONObject) request.get("payload");
        assertions = (JSONObject) jsonObject.get("assertions");
    }

    public Response sendPostRequest() { // for post requests this method should be used
        return RestAssured.given()
                .contentType("application/json")
                .body(requestPayload.toJSONString())
                .post(url);
    }
    
    public Response sendGetRequest() {// for get requests this method should be used
        return RestAssured.given()
                .contentType("application/json")
                .get(url);
    }

    public Response sendPutRequest() {// for put requests this method should be used
        return RestAssured.given()
                .contentType("application/json")
                .body(requestPayload.toJSONString())
                .put(url);
    }

    public void validateResponse(Response response) {// method added for the response assertion
        for (Object key : assertions.keySet()) { // for loop to iterate over the list of keys i.e attributes of response
            String assertionKey = (String) key;
            switch (assertionKey) {// For each key value pair done assertoin
                case "responseCode":
                    int expectedResponseCode = ((Long) assertions.get("responseCode")).intValue();
                    assert response.statusCode() == expectedResponseCode : "Expected status code was : " + expectedResponseCode + " but we got : " + response.statusCode();
                    break;
                case "content-type":
                    String expectedContentType = (String) assertions.get("content-type");
                    assert response.contentType().contains(expectedContentType) : "Expected content type was : " + expectedContentType + " but we got: " + response.contentType();  // Added method .contains on the content type due to the responce was giving "application/json; charset=utf-8"
                    break;
                case "maxResponseTimeInMiliseconds":
                    long maxResponseTime = (Long) assertions.get("maxResponseTimeInMiliseconds");
                    assert response.time() <= maxResponseTime : "Response time exceeded. Expected max time was : " + maxResponseTime + " but took : " + response.time();
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected assertion: " + assertionKey);
            }
        }
    }
}
