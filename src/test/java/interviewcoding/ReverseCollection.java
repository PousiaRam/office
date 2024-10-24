package interviewcoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseCollection {

	public static void main(String[] args) {

		String input = "seleniumjava";
		// System.out.println(input.length());

		List<Character> ab = new ArrayList<Character>();

		for (int i = input.length() - 1; i >= 0; i--) {

			char c = input.charAt(i);

			ab.add(c);

		}

		System.out.println(ab);

	}

}
