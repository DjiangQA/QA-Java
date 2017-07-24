package main;

public class Newspaper extends Items {
	
	String publisher;
	boolean languageEnglish;
	
	public String newsPaperInfo()
	{
		return new String ("Publisher: "+ publisher +" Enlish:"+ languageEnglish +" Name: "+ itemName + " item ID:" + itemID + " Number Available:" + numberAvailable + " PublishDate: " + publishDate);
	}

	public Newspaper(String itemName, int itemID, int numberAvailable, String publishDate, String publisher, boolean languageEnglish) {
		super(itemName, itemID, numberAvailable, publishDate);
		this.publisher = publisher;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	

}
