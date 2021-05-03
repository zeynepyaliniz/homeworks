package gameSimulator;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " added succesfully!!!");
		
	}

	@Override
	public void update(Campaign campaign) {

		System.out.println(campaign.getName() + " updated succesfully!!!");
		
	}

	@Override
	public void delete(Campaign campaign) {

		System.out.println(campaign.getName() + " deleted succesfully!!!");
		
	}

}
