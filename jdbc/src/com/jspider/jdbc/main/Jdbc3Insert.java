package src.com.jspider.jdbc.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc3Insert {

	private static Connection connection;
	private static Statement statement;
	private static int result;
	private static Properties properties = new Properties();
	private static FileReader fileReader;

	public static void main(String[] args) {
		try {
			// Step:- 1 Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				fileReader = new FileReader("D:\\Vishal Tawar\\WEJE-2\\jdbc\\resources\\db_info.properties");
				try {
					properties.load(fileReader);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			try {
				// Step:- 2 Open the connection
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2", properties);
				// step :-3
				statement = connection.createStatement();
				result = statement.executeUpdate("insert into student values(7,'Aakash','aak@123') ");
				System.out.println(result + " row(s) affected");

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

			try {
				connection.close();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
			try {
				statement.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
	}

}
