package basics;

import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testing_JSON {

	private static final Logger logger = LoggerFactory
			.getLogger(testing_JSON.class);

	public static void main(String[] args) throws JSONException {
		JSONObject jo = new JSONObject(); // creating JSONObject
		jo.put("firstname", "raja");
		jo.put("lastname", "smith");// putting data to JSONObject
		jo.put("age", 25);
		System.out.println(jo);
		System.out.println("----------------------------------");

		Map m = new LinkedHashMap(4); // for address data, first create
										// LinkedHashMap
		m.put("street address", "21 2nd Street");
		m.put("City", "New York");
		m.put("State", "NY");
		m.put("Postal Code", 10021);

		System.out.println("----------------------------------");
		System.out.println(m);
		jo.put("address", m); // putting address to JSONObject
		System.out.println(jo);

		JSONArray j1 = new JSONArray();
		m = new LinkedHashMap(2);
		m.put("type", "home");
		m.put("number", "0844-2822644");

		System.out.println("----------------------------------");
		System.out.println(m);
		j1.put(m);
		System.out.println(j1);

		m = new LinkedHashMap(2);
		m.put("type", "fax");
		m.put("number", "212 555-1234");

		System.out.println("----------------------------------");
		System.out.println(m);
		j1.put(m);
		System.out.println(j1);

		System.out.println("----------------------------------");
		jo.put("phoneNumbers", j1);
		System.out.println(jo);

		logger.info("JSON Object is created sucessfully!!...");

	}
}
