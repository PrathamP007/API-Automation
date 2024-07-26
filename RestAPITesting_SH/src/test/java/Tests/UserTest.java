package Tests;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import java.io.IOException;
import io.restassured.response.Response;
import testComponent.baseTest;

public class UserTest extends baseTest {
    
	@Test(groups = {"sanity"})
    public void CreateUserTest() throws IOException, ParseException {
        readJson("/home/binarybrain/eclipse-workspace/RestAPITesting_SH/src/main/java/endpoints/createUser.json"); //called the readjson method for each API test separetly instead of adding it i the @beforeClass or @beforeMethod so that we could add the test specific file in the test method itself
        Response response = sendPostRequest();
        validateResponse(response); //Assertoin part
    }
    
	@Test(groups = {"sanity"})
    public void GetSingleUserTest() throws IOException, ParseException {
        readJson("/home/binarybrain/eclipse-workspace/RestAPITesting_SH/src/main/java/endpoints/getSingleUser.json");
        Response response = sendGetRequest();
        validateResponse(response);
    }
    
	@Test(groups = {"sanity"})
    public void GetUsersTest() throws IOException, ParseException {
        readJson("/home/binarybrain/eclipse-workspace/RestAPITesting_SH/src/main/java/endpoints/getUsers.json");
        Response response = sendGetRequest();
        validateResponse(response);
    }
}
