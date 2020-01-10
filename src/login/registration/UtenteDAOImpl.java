package login.registration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UtenteDAOImpl implements UtenteDAO {

	static Connection con;
	static Statement st;
	static ResultSet rs;

	@Override
	public int insertUtente(Utente user) {

		int status = 0;

		try {
			con = MyConnectionProvider.dbConn();
			st = con.createStatement();
			String sql = "INSERT INTO utenti (username,firstname,lastname,password,password2,email) VALUES ('"
					+ user.getUsername() + "','" + user.getFirstname() + "','" + user.getLastname() + "','"
					+ user.getPassword() + "','" + user.getPassword2() + "','" + user.getEmail() + "')";
			rs = st.executeQuery(sql);
			con.close();
			status = 1;

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return status;
	}

	@Override
	public Utente getUtente(String username, String password) {

		Utente user = new Utente();
		try {

			con = MyConnectionProvider.dbConn();
			st = con.createStatement();
			String sql = "SELECT * from utenti WHERE username = '" + username + "' and password = '" + password + "'";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				user.setUsername(rs.getString(1));
				user.setFirstname(rs.getString(2));
				user.setLastname(rs.getString(3));
				user.setPassword(rs.getString(4));
				user.setPassword2(rs.getString(5));
				user.setEmail(rs.getString(6));
			}
			con.close();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return user;
	}

}
