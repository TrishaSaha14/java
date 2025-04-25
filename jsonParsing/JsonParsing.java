package jsonParsing;

public class JsonParsing {
	public static void main(String[] args) {
		String json = "{\"name\":\"Rohit\",\"age\":26}"; // used \" to include double quotes inside double quotes

		String parsed = json.replace("{", "").replace("}", ""); // for replace method { is considered to be braces only
																// otherwise if we use replace all it will be considered
																// as a quantifier
		String[] arr = parsed.split(",");

		for (String s : arr) {
			String[] keyValue = s.split(":");
			String key = keyValue[0].replace("\"", "").trim();
			String value = keyValue[1].replace("\"", "").trim();

			System.out.println(key + " => " + value);
		}

		String multiLine = """
					{
					 "name":"Rohit",
					 "age":"24"
					}
				""";
	}
}
