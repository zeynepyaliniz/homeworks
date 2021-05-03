package gameSimulator;

public class Utils {
	public static Boolean isValidGamer(Gamer gamer,String message) {
		if(gamer.getId()  <= 0) {
			System.out.println(message);
			return false;
		}else return true;
	}
	public static Boolean isValidGame(Game game) {
		if(game.getId() <= 0) {
			System.out.println("Game is not avaiable..");	
			return false;
		}else return true;
		
		
	}
	public static Boolean isValid(Gamer gamer, People people) {
		if(gamer.getId() != people.getNationalId()) {
			System.out.println("User could not validated with e government system..");	
			return false;
		}else System.out.println("User validated succesfully...");	return true;	
	}
	
	public static void ApplyCampaign(Campaign campaign,Game game) {
		if(campaign.getId() <= 0) {
			System.out.println("Please enter valid campaign code!!");	
			return;
		}else {
			System.out.println(campaign.getName() + " applied successfully!!! "
					+ "after campaign game price is "+game.getPriceAfterDiscount(campaign.getDiscount()));
		}
		
	}
}
