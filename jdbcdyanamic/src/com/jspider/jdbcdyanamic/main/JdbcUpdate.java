package com.jspider.jdbcdyanamic.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUpdate {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static Properties properties = new Properties();
	private static FileReader fileReader;
	private static int result;
	private static String filePath;
	private static String driverPath;
	private static String dburl;	
	private static String query;

	public static void main(String[] args) {
		try {
			fileReader = new FileReader("E:\\Vishal Tawar\\WEJE-2\\jdbcdyanamic\\resources\\db_info.properties");

			properties.load(fileReader);

			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2", properties);
			// query="update student set name='Raju' where id=?";
			preparedStatement = connection.prepareStatement("update student set name='Raju' where id=?");
			preparedStatement.setInt(1, 122);
			result = preparedStatement.executeUpdate();
			System.out.println(result + " ros(s) Updated");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}

	}
}
