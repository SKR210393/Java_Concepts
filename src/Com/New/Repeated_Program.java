package Com.New;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_Program {

	public static void main(String[] args) {
		String v = "Transforming to Java Automation with Java Tool and Selinum Tool";

		String[] split = v.split(" ");
//
//		for (String s : split) {
//			System.out.println(s);
//		}

		Map<String, Integer> v1 = new HashMap<String, Integer>();

		for (String x : split) {

			if (v1.containsKey(x)) {
				Integer integer = v1.get(x);
				v1.put(x, integer + 1);

			} else {
				v1.put(x, 1);
			}
		}

		Set<Entry<String, Integer>> entrySet = v1.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			
			if (entry.getValue()>1) {
				
				System.out.println(entry);
			}
		}
	}

}
