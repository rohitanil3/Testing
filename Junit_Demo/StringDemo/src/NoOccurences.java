import java.util.HashMap;
import java.util.Map;

public class NoOccurences {

	public static void main(String[] args) {

		String company = "Marsh and McLennan";

		Map<Character, Integer> map = new HashMap<>();

		char[] charArray = company.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (!Character.isWhitespace(charArray[i])) {
				if (map.containsKey(charArray[i])) {
					map.put(charArray[i], map.get(charArray[i]) + 1);
				} else {
					map.put(charArray[i], 1);
				}

			}
		}

		map.forEach((k, v) -> System.out.println(k + " " + v));

	}

}
