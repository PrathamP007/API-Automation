package payloads;

import org.apache.commons.lang3.RandomStringUtils;

public class Organisational_HierarchypPayload {
	public static String creatCROPayload() {
		return "{\n"
				+ "    \"name\": \"CRO " +RandomStringUtils.randomAlphabetic(5)+ "\",\n"
				+ "    \"type\": \"cro\",\n"
				+ "    \"parent_id\": 44 \n"
				+ "}";	
	}
     public static String createLOBPayload() {
		return "{\n"
				+ " \"name\":\"LOB " +RandomStringUtils.randomAlphabetic(5)+ "\",\n"
				+ "  \"type\":\"lob\" \n"
				+ "}";
	}
     public static String CreateChannelHeadPayload() {
    	 return "{\n"
 				+ "    \"name\": \"channel head " +RandomStringUtils.randomAlphabetic(5)+ "\",\n"
 				+ "    \"type\": \"channel head\" ,\n"
 				+ "    \"parent_id\": 62 \n"
 				+ "}";
     }
     public static String createZSMPayload() {
    	 return "{\n"
    	 		+ " \"type\":\"zsm\",\n"
    	 		+ " \"name\":\"ZSM " +RandomStringUtils.randomAlphabetic(5)+ "\",\n"
    	 		+ " \"parent_id\":63 \n"
    	 		+ "}";
     }
     public static String createRSMPayload() {
    	 return "{\n"
    			+" \"name\":\"RSM " +RandomStringUtils.randomAlphabetic(5)+ "\",\n"
    			+" \"type\":\"rsm\" ,\n"
    		    +" \"parent_id\":98 \n"
    		    +"}";
     }
     public static String createASMPayload() {
    	 return "{\n"
    	 		+ " \"name\": \"ASM " + RandomStringUtils.randomAlphabetic(5)+ "\",\n"
    	 		+ " \"parent_id\":42,\n"
    	 		+ " \"type\":\"asm\" \n"
    	 		+ "}";
     }
    	 public static String deletePayload(int id) {
        	 return "{\n"
        	 		+ "    \"ids\": [\n"
        	 		+ "        " + id + "\n"
        	 		+ "    ]\n"
        	 		+ "}";
         }
    	 public static String updateLOBPayload() {
        	 return"{\r\n"
        	 		+ "    \"name\": \"LOB  edited"+RandomStringUtils.randomAlphabetic(4)+"\" , \r\n"
        	 		+ "    \"status\": \"Active\",\r\n"
        	 		+ "    \"type\": \"lob\"\n"
        	 		+ "}";
         }
    	 public static String updateCROPayload() {
    		return"{\n"
    				+" \"name\": \"CRO  edited" +RandomStringUtils.randomAlphabetic(4)+"\", \n" 
    				+" \"parent_id\": 44, \n" 
    				+" \"status\": \"Active\", \n"
    				+" \"type\": \"cro\"\n"
    				+"}"; 
    	 }
    	 public static String updateChannelHeadPayload() {
    		 return"{\n"
    		 		+ "\"name\": \"channel head edited" +RandomStringUtils.randomAlphabetic(4)+"\", \n"
    		 		+ "\"status\": \"Active\", \n"
    		 		+" \"type\": \"channel head\",\n"
    		 		+ "\"parent_id\": 62 \n"
    	            + "}";
    	 
    	 }
    	 public static String updateZSMPayload() {
    		 return"{\n"
    		 		+ "\"name\": \"ZSM edited "+RandomStringUtils.randomAlphabetic(4)+ "\",\n"
    		 		+ "\"parent_id\": 63 ,\n"
    		 		+ "\"status\": \"Active\", \n"
    		 		+ "\"type\": \"zsm\" \n"
    		 		+ "}";
    	 }
    	 public static String updateRSMPayload() {
    		 return"{\n"
    		 		+ "\"name\": \"RSM edited "+RandomStringUtils.randomAlphabetic(4)+"\",\n"
    		 		+ "\"parent_id\": 98, \n"
    		 		+ "\"status\": \"Active\", \n"
    		 		+ "\"type\": \"rsm\"\n"
    		 		+ "}";
    	 }
    	 public static String updateASMPayload() {
    		 return"{\n"
    		 		+ "\"name\": \"ASM edited "+RandomStringUtils.randomAlphabetic(4)+"\", \n"
    		 		+ "\"parent_id\": 42, \n"
    		 		+ "\"status\": \"Active\", \n"
    		 		+ "\"type\": \"asm\" \n"
    		 		+ "}";
    	 }
}
     
     
     

		 

