package mulesoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Retrieve_data {

	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:movies.db");
			if (con != null) {
				PreparedStatement ps = con.prepareStatement("select * from movie");
				ResultSet rs = ps.executeQuery();
				System.out.println("Name\tActor\tActress\tDirector\tYear");
				System.out.println("_________________________________________________");
				while (rs.next()) {
					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
							+ rs.getString(4) + "\t" + rs.getInt(5));

				}

			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}
