import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		String sre = "123456";
		
		

		map.put("Suhas", 100);
		map.put("Vidyut", 90);
		map.put("Vikas", 99);
		map.put("Piyush", 80);
		map.put("Vidya", 70);

		List<Integer> list = map.values().stream().sorted().collect(Collectors.toList());

		for (Integer integer : list) {
			System.out.println(integer);
		}
		Map<String, Integer> sortedmap = new HashMap<>();

		for (Integer integer : list) {

			for (Map.Entry<String, Integer> entry : map.entrySet()) {

				if (entry.getValue().equals(integer)) {
					sortedmap.put(entry.getKey(), entry.getValue());
				}

			}

		}
		
		System.out.println("sorted map ");
		for (Map.Entry<String, Integer> entry : sortedmap.entrySet()) {

			System.out.println(entry.getKey()+" "+entry.getValue());

		}

	}

}
