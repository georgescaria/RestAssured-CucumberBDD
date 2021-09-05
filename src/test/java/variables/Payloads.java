package variables;

public class Payloads {

	public static String address = "{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n"
			+ "    \"lng\": 33.427362\r\n" + "  },\r\n" + "  \"accuracy\": 50,\r\n"
			+ "  \"name\": \"Aykara House\",\r\n" + "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
			+ "  \"address\": \"New house\",\r\n" + "  \"types\": [\r\n" + "    \"mens park\",\r\n" + "    \"shop\"\r\n"
			+ "  ],\r\n" + "  \"website\": \"http://google.com\",\r\n" + "  \"language\": \"French-IN\"\r\n" + "}\r\n"
			+ "";

	public static String sampleAPI = "{\r\n" + "  \"dashboard\":{\r\n" + "    \"purchaseAmount\":910,\r\n"
			+ "    \"website\":\"rahul.com\"\r\n" + "  },\r\n" + "  \"courses\":[\r\n" + "    {\r\n"
			+ "      \"title\":\"Selenium Python\",\r\n" + "      \"price\":50,\r\n" + "      \"copies\":6\r\n"
			+ "    },\r\n" + "    {\r\n" + "      \"title\":\"Cypress\",\r\n" + "      \"price\":40,\r\n"
			+ "      \"copies\":4\r\n" + "    },\r\n" + "    {\r\n" + "      \"title\":\"RPA\",\r\n"
			+ "      \"price\":45,\r\n" + "      \"copies\":10\r\n" + "    }\r\n" + "  ]\r\n" + "}";

	public static String addBook(String isbn, String aisle)
	{
		return "{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Me\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n"
				+ "";
	}
	
}