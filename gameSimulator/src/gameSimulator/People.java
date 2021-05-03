package gameSimulator;

public class People {
	private String firstName;
	private String lastName;
	private String birthDate;
	private long nationalId;
	public People(String firstName,String lastName,String birthDate,long nationalId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.nationalId = nationalId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;				
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public long getNationalId() {
		return nationalId;
	}
	public void setNationalId(long nationalId) {
		this.nationalId = nationalId;
	}
	

}
