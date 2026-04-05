package oops.concept;

public class reverseWord {
	public static void main(String[] args) {
		String s = "My Name is Sakshi";

		String[] words = s.split(" ");
		String result = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reversedWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reversedWord += word.charAt(j);
			}
			result += reversedWord;

			if (i < words.length - 1) {
				result += " ";
			}
		}

		System.out.println("Reversed: " + result);
	}
}
