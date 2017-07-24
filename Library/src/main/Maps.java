package main;

public class Maps extends Items {
	
	String location;
	String areaCode;
	
	public String mapinfo()
	{
		return new String ("Location:"+ location +" Area code:"+areaCode+" Name: "+ itemName + " item ID:" + itemID + " Number Available:" + numberAvailable + " PublishDate: " + publishDate);
	}

	public Maps(String itemName, int itemID, int numberAvailable, String publishDate, String location, String areaCode) {
		super(itemName, itemID, numberAvailable, publishDate);
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
