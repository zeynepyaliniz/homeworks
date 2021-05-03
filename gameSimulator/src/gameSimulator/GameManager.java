package gameSimulator;

public class GameManager implements GameService {
	
	public GameManager() {
		
	}	
	
	@Override
	public void sale(Game game,Gamer gamer) {
		String message = "sale game!!";
		
		if(Utils.isValidGamer(gamer, message)	& Utils.isValidGame(game)) {
			System.out.println("Game Sold Successfully...");
						
		}else System.out.println("Not Sold");
	}

	@Override
	public void buy(Game game,Gamer gamer,Campaign campaign) {
		
		String message = "buy game!!";
		
		if(Utils.isValidGamer(gamer, message) & Utils.isValidGame(game)) {
			Utils.ApplyCampaign(campaign,game);
			System.out.println("Game Bought Successfully...");
						
		}else System.out.println("Could Not Buy"); 
	}
	
	

}
