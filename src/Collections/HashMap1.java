package Collections;

import java.util.HashMap;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
        HashMap<String, String> capital = new HashMap<String,String>();		
		
        capital.put("TS", "HYD");
        capital.put("AP", "AMR");
        capital.put("TN", "CHE");
        capital.put("HR", "CGR");
        capital.put("PJ", "CGR");
		
		//display one value
		System.out.println(capital.get("PJ"));

		//display all values
		Set<String> allkeys = capital.keySet();
		for(String keyname : allkeys)
		{
			System.out.println("the value of key '" + keyname + "' is : " + capital.get(keyname));
		}
		
	}

}
