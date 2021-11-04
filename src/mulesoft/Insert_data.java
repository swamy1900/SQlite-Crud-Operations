package mulesoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert_data {

	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:movies.db");
			if (con != null) {
//				Statement st = con.createStatement();
//				int x = st.executeUpdate("insert into movie values('RRR','RC','alia','rajamouli',2022)");

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Movie Name");
				String name = sc.next();
				System.out.println("Enter Actor Name");
				String actor = sc.next();
				System.out.println("Enter Actress Name");
				String actress = sc.next();
				System.out.println("Enter Director Name");
				String director = sc.next();
				System.out.println("Enter the year movie to be released");
				int year = sc.nextInt();

				String query = "insert into movie values(?,?,?,?,?)";

				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, name);
				ps.setString(2, actor);
				ps.setString(3, actress);
				ps.setString(4, director);
				ps.setInt(5, year);

				int x = ps.executeUpdate();
				System.out.println(x);

			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}
