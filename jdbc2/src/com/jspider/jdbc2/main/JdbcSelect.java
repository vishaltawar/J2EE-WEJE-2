package com.jspider.jdbc2.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcSelect {

	private static Connection connection;
	//private static PreparedStatement preparedStatement;
	private static Statement statement;
	private static ResultSet resultSet;
	private static Properties properties = new Properties();
	private static FileReader fileReader;
	private static String filePath = "I:\\Vishal Tawar\\WEJE-2\\jdbc2\\resources\\db_info.properties";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			fileReader= new FileReader(filePath);
			properties.load(fileReader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties);
			statement=connection.createStatement();
			resultSet=statement.executeQuery("call proc2()");
			while(resultSet.next()) {
				Student student=new Student();
				
				student.setId(resultSet.getInt(1));
				student.setName(resultSet.getString(2));
				student.setEmail(resultSet.getString(3));
				System.out.println(student);
				
			}
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
		
}