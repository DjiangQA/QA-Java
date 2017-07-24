package main;

public class Books extends Items {
	
	String generes;
	
	public String bookinfo()
	{
		return new String ("Generes:"+ generes +" Name: "+ itemName + " item ID:" + itemID + " Number Available:" + numberAvailable + " PublishDate: " + publishDate);
	}

	public Books(String itemName, int itemID, int numberAvailable, String publishDate, String generes) {
		super(itemName, itemID, numberAvailable, publishDate);
		this.generes = generes;
	}

	public String getGeneres() {
		return generes;
	}

	public void setGeneres(String generes) {
		this.generes = generes;
	}
	
	
	
}
