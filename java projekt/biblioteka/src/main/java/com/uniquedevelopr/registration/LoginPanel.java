package com.uniquedevelopr.registration;

import java.sql.*;

public class LoginPanel {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/logowanie";
		String user = "root";
		String password = "P@ssw0rd";
		String email = "email-login";
		String haslo = "haslo-login";

		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			String query = ("select * from users where email = ? and haslo = ? ");
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, email);
			stmt.setString(2, haslo);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				System.out.println("Zalogowano pomyślnie!");
			} else {
				System.out.println("Niepoprawny login lub hasło!");
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}