package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>(); // ¾Õ ÀÎÀÚ°¡ key. (String)

		map.put("±èÄ¡", 85);
		map.put("È«±æµ¿", 90);
		map.put("¹Ú¼ö", 89);
		map.put("µ¿Àå±º", 75);
		System.out.println("ÃÑ Entry ¼ö : " + map.size());

		// °´Ã¼ Ã£±â
		System.out.println("\tÈ«±æµ¿ : " + map.get("È«±æµ¿"));

		// °´Ã¼ Å° ¸ðµÎ ¹Þ±â
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value); // Å° : ³»¿ë
		}

		System.out.println();

		map.remove("È«±æµ¿");
		System.out.println("ÃÑ Entry ¼ö : " + map.size());

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryInterator = entrySet.iterator();

		while (entryInterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryInterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value); // Å° : ³»¿ë
		}

	}

}