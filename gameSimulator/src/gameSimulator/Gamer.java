package gameSimulator;

public class Gamer extends People {
	private long id;
	private String email;
	
	public Gamer(String firstName, String lastName, String birthDate, long nationalId,long id,String email) {
		super(firstName, lastName, birthDate, nationalId);
		this.email = email;
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
