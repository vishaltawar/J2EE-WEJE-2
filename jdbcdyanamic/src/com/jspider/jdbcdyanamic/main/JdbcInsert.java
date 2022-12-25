package com.jspider.jdbcdyanamic.main;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcInsert {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static int result;
	private static Properties properties = new Properties();
	private static FileReader fileReader;
	
	//private static String filePath;
	//private static String driverPath;
	private static String query;
	
	public static void main(String[] args) {
		try {
			fileReader=new FileReader("E:\\Vishal Tawar\\WEJE-2\\jdbcdyanamic\\resources\\db_info.properties");
			properties.load(fileReader);
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2","root","root");
		
			query="insert into student values(?,?,?)";
			preparedStatement=connection.prepareStatement("query");
			preparedStatement.setInt(1, 3);
			preparedStatement.setString(2, "Rajesh");
			preparedStatement.setString(3, "raj@123");
			result=preparedStatement.executeUpdate();
			System.out.println(result+" ros(s) inserted");
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	

}
