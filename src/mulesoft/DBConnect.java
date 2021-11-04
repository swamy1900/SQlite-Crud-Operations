package mulesoft;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:movies.db");
			if (con != null) {
				System.out.println("Connection established");

			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}
