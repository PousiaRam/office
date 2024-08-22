package interviewcoding;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {

	@DataProvider(name = "dataProvider")
	public Object[][] dataProvider() {

		Object[][] a = { { "Ram", 2 }, { "Pousia", 4 } };

		return a;

	}

	@Test(dataProvider = "dataProvider")
	public void testm(String name, int rollNo) {
		System.out.println("Student " + name + " " + rollNo);

	}

}
