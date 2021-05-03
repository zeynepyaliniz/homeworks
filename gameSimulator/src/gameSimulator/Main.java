package gameSimulator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to game platform...");
		
		People people = new People("Zeynep","Yaliniz","18.12.1993",123456);
		Gamer gamer = new Gamer("Zeynep","Yaliniz","18.12.1993",123456,123456,"mail@gmail.com");
		GamerManager gamerManager = new GamerManager();
		System.out.println("*****************");

		// Validate e government system to CRUD operation in gamer:
		if(!Utils.isValid(gamer, people)) {
			return;
		}
		gamerManager.add(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		System.out.println("*****************");
		
		Campaign[] campaigns = {new Campaign(1, "Special Gamer Campaign", "30% Discount for Being Active Gamer", 30.0),
				new Campaign(2, "Quarter Part Campaign", "25% Discount After Quarter of Year", 25.0)};
		CampaignManager campaignManager = new CampaignManager();
		for(Campaign campaign : campaigns) {
			campaignManager.add(campaign);
		}
		
		
		
		//Game sale
		// button settings:
		GameManager gameManager = new GameManager();
		Game game = new Game("Mario","Mario Game","1993",10.99,120,"DeveloperTeam",102,4.8,3,"Turkish",21);
		Happy10YearsCampaign tenYearsCampaign = new Happy10YearsCampaign(12,"Happy Ten Years Campaign", "Ten Years Campaign",10.0);
		gameManager.buy(game, gamer, tenYearsCampaign);	
		gameManager.sale(game, gamer);

	}

}
