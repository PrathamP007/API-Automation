package payloads;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang3.RandomStringUtils;

public class UsermanagementPayload {
public static String createAdminPayload(int ID) {
	return"{\n"
			+ "\"username\":\"username "+RandomStringUtils.randomAlphabetic(5)+ "\",\n"
			+ "\"password\":\"Pass@1234\",\n"
			+ "\"mobile_number\":\"89"+RandomStringUtils.randomNumeric(8)+"\",\n"
			+ "\"status\": \"Active\",\n"
			+ "\"rolename\": \"ADMIN\",\n"
			+ "\"role_id\":1 \n"
			+ "}";
}
public static String createHOPayload(int ID) {
	return"{\n"
			+ "\"username\":\"username "+RandomStringUtils.randomAlphabetic(5)+ "\",\n"
			+ "\"password\":\"Pass@1234\",\n"
			+ "\"mobile_number\":\"89"+RandomStringUtils.randomNumeric(8)+"\",\n"
			+ "\"status\": \"Active\",\n"
			+ "\"rolename\": \"ADMIN\",\n"
			+ "\"role_id\":2 \n"
			+ "}";
}
public static String creatHowithoutPromoPayload(int ID) {
	return"{\n"
			+ "\"username\":\"username "+RandomStringUtils.randomAlphabetic(5)+ "\",\n"
			+ "\"password\":\"Pass@1234\",\n"
			+ "\"mobile_number\":\"89"+RandomStringUtils.randomNumeric(8)+"\",\n"
			+ "\"status\": \"Active\",\n"
			+ "\"rolename\": \"ADMIN\",\n"
			+ "\"role_id\":3 \n"
			+ "}";
}
public static String creatDistributorPayload(int ID) {
	return"{\n"
			+ "\"username\":\"username "+RandomStringUtils.randomAlphabetic(5)+ "\",\n"
			+ "\"password\":\"Pass@1234\",\n"
			+ "\"mobile_number\":\"89"+RandomStringUtils.randomNumeric(8)+"\",\n"
			+ "\"status\": \"Active\",\n"
			+ "\"rolename\": \"ADMIN\",\n"
			+ "\"role_id\":4 \n"
			+ "}";
}
public static String creatChannelHeadPayload(int ID) {
	return"{\n"
			+ "\"username\":\"username "+RandomStringUtils.randomAlphabetic(5)+ "\",\n"
			+ "\"password\":\"Pass@1234\",\n"
			+ "\"mobile_number\":\"89"+RandomStringUtils.randomNumeric(8)+"\",\n"
			+ "\"status\": \"Active\",\n"
			+ "\"rolename\": \"ADMIN\",\n"
			+ "\"role_id\":5 \n"
			+ "}";
}
public static String creatZSMPayload(int ID) {
	return"{\n"
			+ "\"username\":\"username "+RandomStringUtils.randomAlphabetic(5)+ "\",\n"
			+ "\"password\":\"Pass@1234\",\n"
			+ "\"mobile_number\":\"89"+RandomStringUtils.randomNumeric(8)+"\",\n"
			+ "\"status\": \"Active\",\n"
			+ "\"rolename\": \"ADMIN\",\n"
			+ "\"role_id\":6 \n"
			+ "}";
}

public static String createRSMPayload(int ID) {
	return"{\n"
			+ "\"username\":\"username "+RandomStringUtils.randomAlphabetic(5)+ "\",\n"
			+ "\"password\":\"Pass@1234\",\n"
			+ "\"mobile_number\":\"89"+RandomStringUtils.randomNumeric(8)+"\",\n"
			+ "\"status\": \"Active\",\n"
			+ "\"rolename\": \"ADMIN\",\n"
			+ "\"role_id\":7 \n"
			+ "}";
}
public static String createASMPayload(int ID) {
	return"{\n"
			+ "\"username\":\"username "+RandomStringUtils.randomAlphabetic(5)+ "\",\n"
			+ "\"password\":\"Pass@1234\",\n"
			+ "\"mobile_number\":\"89"+RandomStringUtils.randomNumeric(8)+"\",\n"
			+ "\"status\": \"Active\",\n"
			+ "\"rolename\": \"ADMIN\",\n"
			+ "\"role_id\":8 \n"
			+ "}";
}
public static String createSalesmanPayload(int ID) {
	return"{\n"
			+ "\"username\":\"username "+RandomStringUtils.randomAlphabetic(5)+ "\",\n"
			+ "\"password\":\"Pass@1234\",\n"
			+ "\"mobile_number\":\"89"+RandomStringUtils.randomNumeric(8)+"\",\n"
			+ "\"status\": \"Active\",\n"
			+ "\"rolename\": \"ADMIN\",\n"
			+ "\"role_id\":9 \n"
			+ "}";
}
public static String createCROPayload(int ID) {
	return"{\n"
			+ "\"username\":\"username "+RandomStringUtils.randomAlphabetic(5)+ "\",\n"
			+ "\"password\":\"Pass@1234\",\n"
			+ "\"mobile_number\":\"89"+RandomStringUtils.randomNumeric(8)+"\",\n"
			+ "\"status\": \"Active\",\n"
			+ "\"rolename\": \"ADMIN\",\n"
			+ "\"role_id\":10 \n"
			+ "}";
}
public static String createHOPromotionOnlyPayload(int ID) {
	return"{\n"
			+ "\"username\":\"username "+RandomStringUtils.randomAlphabetic(5)+ "\",\n"
			+ "\"password\":\"Pass@1234\",\n"
			+ "\"mobile_number\":\"89"+RandomStringUtils.randomNumeric(8)+"\",\n"
			+ "\"status\": \"Active\",\n"
			+ "\"rolename\": \"ADMIN\",\n"
			+ "\"role_id\":11 \n"
			+ "}";
}

//public static String userdeletePayload(int ID ) {
//	return"{\n"
//			+ "\"userIds\":["+ID+"] \n"
//			+ "}";
//}
public static String updateAdminPayload(int ID,String MOB_NO ) {
	return"{\n"
			+ "\"id\": "+ID+",\n"
			+ "\"mobile_number\":"+MOB_NO+",\n"
			+ "\"username\":\"username edited " +RandomStringUtils.randomAlphabetic(5)+ "\" ,\n"
			+"\"email\": \"" +RandomStringUtils.randomAlphabetic(5)+"@gmail.com\",\n"
			+ "\"status\":\"Active\",\n"
			+ "\"rolename\":\"ADMIN\",\n"
			+ "\"role_id\":1\n"
			+ "}";
}
public static String updateHOPayload(int ID ,String MOB_NO) {
	return"{\n"
			+ "\"id\":"+ID+",\n"
			+ "\"mobile_number\":"+MOB_NO+",\n"
			+ "\"username\":\"username edited "+RandomStringUtils.randomAlphabetic(5)+"\",\n"
			+ "\"status\":\"Active\",\n"
			+ "\"rolename\":\"ADMIN\",\n"
			+ "\"role_id\":2\n"
			+ "}";
}
public static String updateHOWithoutPromoPayload(int ID ,String MOB_NO) {
	return"{\n"
			+ "\"id\":"+ID+"\n"
			+ "\"mobile_number\": "+MOB_NO+",\n"
			+ "\"username\": \"username edited "+RandomStringUtils.randomAlphabetic(5)+"\",\n"
			+ "\"status\": \"Active\",\n"
			+ "\"rolename\": \"ADMIN\",\n"
			+ "\"role_id\": 3\n"
			+ "}";
}
public static String updateDistributorPayload(int ID ,String MOB_NO) {
	return"{\n"
			+ "\"id\": "+ID+"\n"
			+ "\"mobile_number\":"+MOB_NO+",\n"
			+ "\"username\": \"username edited "+RandomStringUtils.randomAlphabetic(5)+"\",\n"
			+ "\"status\": \"Active\",\n"
			+ "\"rolename\": \"ADMIN\" ,\n"
			+ "\"role_id\": 4\n"
			+"}";
			
}
public static String updateChannelHeadPayload(int ID ,String MOB_NO) {
	return "{\n"
			+ "\"id\":"+ID+"\n"
			+ "\"mobile_number\":"+MOB_NO+",\n"
			+ "\"username\": \"username edited "+RandomStringUtils.randomAlphabetic(5)+"\",\n"
			+ "\"status\": \"Active\" ,\n"
			+ "\"rolename\": \"ADMIN\",\n"
			+ "\"role_id\": 4\n"
			+ "}";
}
public static String updateZSMPayload(int ID ,String MOB_NO) {
	return"{\n"
			+ "\"id\":"+ID+" \n"
			+ "\"mobile_number\":"+MOB_NO+"\n"
			+ "\"username\": \"username edited "+RandomStringUtils.randomAlphabetic(5)+"\",\n"
			+ "\"status\": \"Active\",\n"
			+ "\"rolename\": \"ADMIN\",\n"
			+ "\"role_id\": 6\n"
			+ "}";
}
public static String updateRSMPayload(int ID,String MOB_NO) {
	return"{\n"
			+ "\"id\":"+ID+" \n"
			+ "\"mobile_number\":"+MOB_NO+"\n"
			+ "\"username\": username edited "+RandomStringUtils.randomAlphabetic(5)+"\",\n"
			+ "\"status\": \"Active\" ,\n"
			+ "\"rolename\": \"ADMIN\",\n"
			+ "\"role_id\": 7\n"
			+ "}";			
}
public static String updateASMPayload(int ID , String MOB_NO) {
	return""
			+ "id:"+ID+" \n"
			+ "mobile_number: "+MOB_NO+"\n"
			+ "\"username\": username edited "+RandomStringUtils.randomAlphabetic(5)+"\",\n"
			+ "\"status\":\"Active\",\n"
			+ "\"rolename\":\"ADMIN\" ,\n"
			+ "\"role_id\": 8\n"
			+ "}";
}
public static String updateSalesmanPayload(int ID , String MOB_NO) {
	return"{"
			+ "\"id\":"+ID+" \n"
			+ "\"mobile_number\":"+MOB_NO+" \n"
			+ "\"username\": username edited "+RandomStringUtils.randomAlphabetic(5)+"\",\n"
			+ "\"status\": \"Active\",\n"
			+ "\"rolename\": \"ADMIN\"\n"
			+ "\"role_id\": 9"
			+ "}";
}
//public static String updateCROPayload() {
//	return"";
//}
//public static String HOWithoutPromo() {
//	return"";
//}
}
