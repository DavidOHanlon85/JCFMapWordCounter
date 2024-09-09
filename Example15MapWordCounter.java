package slideDeckChallenges;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;

public class Example15MapWordCounter {

	public static void main(String[] args) {

		String sentence = "To be or not to be to be or not to be";

		// Create the HashMap

		Map<String, Integer> myMap = new HashMap<String, Integer>();

		// tokenize the input

		String[] tokens = sentence.split(" ");

		// processing input text

		for (String token : tokens) {
			if (myMap.containsKey(token)) {
				int count = myMap.get(token);
				myMap.put(token, count + 1);
			} else {
				myMap.put(token, 1);
			}
		}

		System.out.println("\nMap contains: \nKey\t\tValue ");

		// Display all map content
		for (String key : myMap.keySet()) {
			System.out.printf("%-10s%10d \n", key, myMap.get(key));
		}

		// Display a value based on a key

		if (myMap.containsKey("not")) {
			System.out.println("Value for key \"not\" : " + myMap.get("not"));
		} else {
			System.out.println("Key not found ");
		}

	}

}
