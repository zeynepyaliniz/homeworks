package gameSimulator;

public class Game {
	private String name;
	private String chart;
	private String launchDate;
	private double price;
	private int downloadCount;
	private String developer;
	private double size;
	private double rating;
	private int age;
	private String language;
	int id;
	
	
	public double getPriceAfterDiscount(double discount) {
		return this.price - this.price*discount/100;
	}

	public Game(String name,String chart, String launchDate,
			double price,int downloadCount,String developer,
			double size, double rating, int age, String language, int id) {
		this.name = name;
		this.chart = chart;
		this.launchDate = launchDate;
		this.price = price;
		this.downloadCount = downloadCount;
		this.developer = developer;
		this.size = size;
		this.rating = rating;
		this.age = age;
		this.language = language;
		this.id = id;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getChart() {
		return chart;
	}


	public void setChart(String chart) {
		this.chart = chart;
	}


	public String getLaunchDate() {
		return launchDate;
	}


	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getDownloadCount() {
		return downloadCount;
	}


	public void setDownloadCount(int downloadCount) {
		this.downloadCount = downloadCount;
	}


	public String getDeveloper() {
		return developer;
	}


	public void setDeveloper(String developer) {
		this.developer = developer;
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
