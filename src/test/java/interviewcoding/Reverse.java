package interviewcoding;

public class Reverse {

	public static void main(String[] args) {

		String input = "ramari";
		// System.out.println(input.length());
		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {

			output = output + input.charAt(i);

		}

		if (input.equalsIgnoreCase(output)) {
			System.out.println("true");

		} else
			System.out.println("false");

	}

}
