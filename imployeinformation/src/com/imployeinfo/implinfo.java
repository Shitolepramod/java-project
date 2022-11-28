package com.imployeinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class implinfo {


	
		public static Connection creteConnection () throws ClassNotFoundException, SQLException{
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String url=("jdbc:mysql://localhost:3306/implinfo");
			String password="root";
			String username="root";
			
			Connection con=DriverManager.getConnection(url,password,username);
			
			return con;
		}


			
		}

			
		

	
			
		

	


