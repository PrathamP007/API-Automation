package payloads;

import org.apache.commons.lang3.RandomStringUtils;

public class ReferenceMasterPayload {

    public static String createCityPayload(){
        return "{   \n"
                + "    \"type\":\"City\",\n"
                + "    \"description\":\"City " + RandomStringUtils.randomAlphabetic(8) + "\",\n"
                + "    \"parentId\": 1\n"
                + "}";
	}
	public static String createDistTypePayload() {
    	return "{\n"
    			+ "    \"type\":\"Distributor Type\",\n"
    			+ "    \"description\":\"Dist_Type" + RandomStringUtils.randomAlphabetic(5)+"\" ,\n"
    			+ "    \"status\":\"Active\"\n"
    			+ "}";
    }
	public static String createPaymentModePayload() {
    	return "{\n"
    			+ "    \"type\":\"Payment Mode\",\n"
    			+ "    \"description\":\"PaymentM "+ RandomStringUtils.randomAlphabetic(5)+"\" \n"
    			+ "}";
	}	
    	public static String createPaymentTermPayload() {
        	return "{\n"
        			+ "    \"type\":\"Payment Term\",\n"
        			+ "    \"description\":\"PaymentT "+RandomStringUtils.randomAlphabetic(5)+"\"\n"
        			+ "}";
}
    	public static String createStatePayload() {
        	return "{\n"
        			+ "    \"type\":\"State\",\n"
        			+ "    \"description\":\"Kolkata "+RandomStringUtils.randomAlphabetic(5)+"\" \n"
        			+ "}";
	}
    	public static String deletedisttypePayload(int ID ) {
       	 return "{\n"
       	 		+ "\"ids\":["+ID +"],\n"
       	 		+ "  \"type\": \"Distributor Type\" \n"
       	 		+ "}";
        }
    	public static String deletePaymentModePayload(int ID) {
    		return "{\n"
           	 		+ "\"ids\":["+ID +"],\n"
           	 		+ "  \"type\": \"Payment Mode\" \n"
           	 		+ "}";
    	}
    	
    	public static String deletePaymentTermPayload(int ID) {
    		return "{\n"
           	 		+ "\"ids\":["+ID +"],\n"
           	 		+ "  \"type\": \"Payment Term\" \n"
           	 		+ "}";
    	}
    	public static String deleteStatePayload(int ID) {
    		return "{\n"
    				+  "\"ids\":["+ID +"],\n"
    				+ "\"type\": \"State\"\n"
    				+"}";
    		
    	}
    	public static String deleteCityPayload(int ID) {
    		return"{\n"
    				+ "\"ids\": ["+ID +"],\n "
    				+ "\"type\": \"City\" \n"
    				+ "}";
    		
    	}
    	public static String updateDistType() {
    		return"{\n"
    				+ "\"description\": \"Distributor Type edited "+RandomStringUtils.randomAlphabetic(5)+"\",\n"
    				+ "\"status\": \"Active\", \n"
    				+ "\"type\": \"Distributor Type\" \n"
    				+ "}";
    	}
    	public static String updatePaymentMode() {
    		return"{\n"
    				+ "\"description\": \"PaymentMode edited "+RandomStringUtils.randomAlphabetic(5)+"\",\n"
    				+ "\"status\": \"Active\", \n"
    				+ "\"type\": \"Payment Mode\" \n"
    				+ "}";
    	}
    	public static String updatePaymentTerm() {
    		return"{\n"
    				+ "\"description\": \"PaymentTerm edited"+RandomStringUtils.randomAlphabetic(5)+ "\",\n"
    				+ "\"status\": \"Active\", \n"
    				+ "\"type\": \"Payment Term\"\n"
    				+ "}";
    	}
    	public static String updateState() {
    		return"{\n"
    				+ "\"description\": \"State edited" +RandomStringUtils.randomAlphabetic(5)+ "\",\n"
    				+ "\"status\": \"Active\", \n"
    				+ "\"type\": \"State\"\n"
    				+ "}";
    	}
    	public static String updateCity() {
    		return"{\n"
    				+ "\"description\": \"City edited" +RandomStringUtils.randomAlphabetic(5)+"\",\n"
    				+ "\"status\": \"Active\", \n"
    				+ "\"type\": \"City\", \n"
    				+ "\"parentId\": 1 \n"
    				+"}";
    	}
       public static String createDistributorChannel() {
    	   return"{\n"
    	   		+ "\"description\": \"Distributor Channel " +RandomStringUtils.randomAlphabetic(5)+"\", \n"
    	   		+ "\"status\": \"Active\", \n"
    	   		+ "\"type\": \"Distributor Channel \n"
    	   		+ "}";
       }
    	public static String updateDistributorChannel() {
    		return"{\n"
    				+ "\"description\": \"Distributor Channel edited  "+RandomStringUtils.randomAlphabetic(5)+ "\" \n"
    				+ "\"status\": \"Active\", \n"
    				+ "\"type\": \"Distributor Channel \n"
    				+"}";
    	}
    	public static String deleteDistributorChannelPayload(int ID) {
    	return"{\n"
    			+ "\"ids\": ["+ID +"], \n"
    			+ "\"type\": \"Distributor Channel \n"
    			+ "}";
}
    	 public static String createCustomerType() {
    		 return"{\n"
    		 		+ "\"description\": \"Customer Type "+RandomStringUtils.randomAlphabetic(5)+"\" \n"
    		 		+ "\"status\": \"Active\", \n"
    		 		+ "\"type\": \"Customer Type \n"
    		 		+"}";
    	 }
    	 public static String deleteCustomerTypePayload(int ID) {
    		 return"{\n"
    		 		+ "\"ids\": ["+ID +"], \n"
    		 		+ "\"type\": \"Customer Type\n"
    		 		+"}";
    	 }
    	 public static String updateCustomerType() {
    		 return"{\n"
    		 		+ "\"description\": \"Customer Type edited "+RandomStringUtils.randomAlphabetic(5)+"\" \n"
    		 		+ "\"status\": \"Active\", \n"
    		 		+ "\"type\": \"Customer Type\n"
    		 		+"}";
    	 }
    	 public static String CreateCustomerClass() {
    		 return"{\n"
    		 		+ "\"description\": \"Customer Class"+RandomStringUtils.randomAlphabetic(5)+"\" \n"
    		 		+ "\"status\": \"Active\",\n "
    		 		+ "\"type\": \"Customer Class\n"
    		 		+"}";
    	 }
    	 public static String deleteCustomerClass(int ID) {
    		 return"{\n"
    		 		+ "\"ids\": ["+ID+"], \n"
    		 		+ "\"type\": \"Customer Class\n"
    		 		+"}";
    	 }
    	 public static String updateCustomerClass() {
    		 return"{\n"
    		 		+ "\"description\": \"Customer Class edited"+RandomStringUtils.randomAlphabetic(5)+"\" \n"
    		 		+ "\"status\": \"Active\", \n"
    		 		+ "\"type\": \"Customer Class\n"
    		 		+"}";
    	 }
    	 public static String CreateCustomerCategory() {
    		 return"{\n"
    		 		+ "\"description\": \"Customer Category"+RandomStringUtils.randomAlphabetic(5)+"\" \n"
    		 		+ "\"status\": \"Active\", \n"
    		 		+ "\"type\": \"Customer Category\n"
    		 		+"}";
    	 }
    	 public static String deleteCustomerCategory(int ID) {
    		 return"{\n"
    		 		+"\"ids\": ["+ID+"], \n"
    		 		+"\"type\": \"Customer Category \n"
    		 		+"}";
    	 }
    	 public static String updateCustomerCategory() {  
    		 return"{\n"
    		 		+ "\"description\": \"Customer Category"+RandomStringUtils.randomAlphabetic(5)+"\" \n"
    		 		+ "\"status\": \"Active\", \n"
    		 		+ "\"type\": \"Customer Category \n"
    		 		+"}";
    	 }
}