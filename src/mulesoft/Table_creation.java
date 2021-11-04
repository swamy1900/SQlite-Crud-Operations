package mulesoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Table_creation {

	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:movies.db");
			if (con != null) {
				Statement st = con.createStatement();
				int x = st.executeUpdate(
						"create table movie(name varchar(20) primary key,actor varchar(20),actress varchar(20),director varchar(20),year int)");
				System.out.println("Table created");

			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}
