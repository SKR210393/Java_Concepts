package Com.New;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_Word {

	public static void main(String[] args) {

		String s = "What you think What you do What you Want";
		String[] split = s.split(" ");

//for (String a : split) {
//	System.out.println(a);
//}

		Map<String, Integer> n = new HashMap<String, Integer>();

		for (String b : split) {

			if (n.containsKey(b)) {

				Integer i = n.get(b);
				n.put(b, i + 1);

			} else {
				n.put(b, 1);
			}

		}

		Set<Entry<String, Integer>> entrySet = n.entrySet();
		for (Entry<String, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {

				System.out.println(entry);
			}
		}
	}
}
