package login.registration;

public interface UtenteDAO {

	public int insertUtente(Utente user);
	public Utente getUtente(String username, String password);
}
