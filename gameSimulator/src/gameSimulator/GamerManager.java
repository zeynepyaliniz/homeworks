package gameSimulator;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Successfully Saved.");
		}

	@Override
	public void update(Gamer gamer) {
		String message = "Gamer not exist.. Please sign up!!";
		if(Utils.isValidGamer(gamer, message)) {
			System.out.println("Gamer info succesfully updated...");
		}			
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		String message = "Gamer not exist.. Please sign up!!";
		if(Utils.isValidGamer(gamer, message)) {			
			System.out.println("Gamer succesfully deleted...");
			
		}	

		
	}

	
	
}
