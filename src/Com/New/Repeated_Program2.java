package Com.New;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_Program2 {

	public static void main(String[] args) {

		String t = "Rose is the Rose is the Rose";

		String[] split = t.split(" ");

		Map<String, Integer> t1 = new HashMap<String, Integer>();

		for (String s : split) {

			if (t1.containsKey(s)) {

				Integer integer = t1.get(s);
				t1.put(s, integer + 1);

			} else {

				t1.put(s, 1);
			}

		}

		Set<Entry<String, Integer>> entrySet = t1.entrySet();
		for (Entry<String, Integer> entry : entrySet) {

			System.out.println(entry);

		}

	}

}
