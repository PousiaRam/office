package interviewcoding;

public class ReverseStringBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "ramar";

		StringBuffer sb = new StringBuffer(input);
		StringBuffer reverse = sb.reverse();
		String output = reverse.toString();

		if (input.equalsIgnoreCase(output)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
