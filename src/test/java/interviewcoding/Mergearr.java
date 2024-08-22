package interviewcoding;

public class Mergearr {

	public static void main(String[] args) {

		int[] Array1 = { 1, 2, 3 };

		int[] Array2 = { 4, 5, 6, 7 };

		int[] merge = mergeArrays(Array1, Array2);

		for (int i : merge) {
			System.out.print(i + " ");

		}

	}

	private static int[] mergeArrays(int[] array1, int[] array2) {

		int[] res = new int[array1.length + array2.length];

		System.arraycopy(array1, 0, res, 0, array1.length);
		System.arraycopy(array2, 0, res, array1.length, array2.length);

		return res;
	}

}
