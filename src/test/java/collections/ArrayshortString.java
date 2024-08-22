package collections;

import java.util.ArrayList;

public class ArrayshortString {

	public static void main(String[] args) {

		String[] a = { "an", "b", "c", "a" };

		int length = a.length;

		String find = "b";

		int indexOfFind = 0;

		ArrayList<String> ab = new ArrayList<String>();

		for (int i = 0; i <= length - 1; i++) {
			String upString = a[i];

			ab.add(upString);
		}

		if (ab.contains(find)) {

			indexOfFind = ab.indexOf(find);

			ab.remove(indexOfFind);
			System.out.println(ab);

		} else {
			System.out.println("No match found");
		}

	}
}
