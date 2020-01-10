package login.registration;

public class Utente {

	private String username;
	private String firstname;
	private String lastname;
	private String password;
	private String password2;
	private String email;

	public Utente(String usname, String fname, String lname, String pass, String pass2, String mail) {

		this.username = usname;
		this.firstname = fname;
		this.lastname = lname;
		this.password = pass;
		this.password2 = pass2;
		this.email = mail;

	}

	public Utente() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}