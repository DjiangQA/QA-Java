package main;

public abstract class Items {
	String itemName;
	int itemID;
	int numberAvailable;
	String publishDate;
	

	public Items (String itemName, int itemID, int numberAvailable , String publishDate)
	{
		this.itemName = itemName;
		this.itemID = itemID;
		this.numberAvailable = numberAvailable;
		this.publishDate = publishDate;
	}
	
	public String getName() {
		return itemName;
	}

	public int getID() {
		return itemID;
	}
	
	public int getAvailable() {
		return numberAvailable;
	}
	
	public String getPublishDate() {
		return publishDate;
	}
	
	
}
