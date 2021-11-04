package mulesoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete_data {

	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:movies.db");
			if (con != null) {

				Statement st = con.createStatement();
				int x = st.executeUpdate("delete from movie where name='orange'");
				System.out.println(x);
			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}
