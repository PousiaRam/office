package interviewcoding;

public class ReverseWord {

	public void outputM() {

		String input = "Selenium java training session";

		String[] split = input.split(" ");

		for (int i = split.length - 1; i >= 0; i--) {

			String out = split[i];

			System.out.println(out);

		}

	}

	public static void main(String[] args) {

		ReverseWord rv = new ReverseWord();
		rv.outputM();

	}

}
