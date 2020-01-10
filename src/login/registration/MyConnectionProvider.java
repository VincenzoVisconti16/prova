package login.registration;

import java.sql.*;

public class MyConnectionProvider implements MyProvider {

	private static Connection con = null;

	public static Connection dbConn() throws SQLException {

		// Connessione

		try {

			Class.forName("org.mariadb.jdbc.Driver");

		} catch (Exception e) {

			System.err.println(e.getMessage());

		} // fine try/catch

		con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/mydb?user=root"); // aaa è il nome del DB

		return con;
	}

}
