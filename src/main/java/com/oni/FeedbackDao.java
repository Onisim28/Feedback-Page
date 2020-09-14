package com.oni;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedbackDao {
	
	
	
	

	String url="", username="", pass="";
	
	
	
	public void insert_information(String name, String email, String regarding, String fm, int rate) throws SQLException, ClassNotFoundException {
	     
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url, username, pass);
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO application.feedbacks (name, email, regarding, feedback_message, rating)"
				+ " VALUES('"+name+"', '"+email+"', '"+regarding+"', '"+fm+"', "+rate+")");
		preparedStatement.executeUpdate();    
		
	}

}
