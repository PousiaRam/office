package interviewcoding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Database {

	private static String url = "jdbc:mysql://localhost:port/world";
	private static String userName = "userName";
	private static String passWord = "passWord";
	private static String query = "SELECT DISTINCT FROM TABLE";
	private static String columnName = "Column";
	private static Connection con;

	/*
	 * jdbc denots java database connectivity MySQL denotes the DB software
	 * localhost:port points to respective db path world denotes db name
	 * Arguments("userName","password") denotes db credentials
	 */

	public static WebDriver driver(WebDriver driver) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		return driver;

	}

	public Database(Connection con) {

		try {

			con = DriverManager.getConnection(url, userName, passWord);

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	public static Connection getConnection() throws SQLException {

		Statement statement = con.createStatement();

		ResultSet executeQuery = statement.executeQuery(query);

		String string = executeQuery.getString(columnName);

		System.out.println(string);

		return getConnection();

	}

}
