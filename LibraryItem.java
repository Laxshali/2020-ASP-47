abstract class LibraryItem{
	private String title;
	private String itemId;
	private boolean checkOut;
	}
	
	public LibraryItem(String title,String itemId){
		this.title=title;
		this.itemId=itemId;
		this.checkOut=false;
	}
	public void checkOut(){
		this.checkOut=true;
	}
	public void checkIn(){
		this.checkOut=false;
	}
	public void displayItemDetails(){
		System.out.println("Title: "+ title);
		System.out.println("ItemId: "+itemId);
		System.out.println("Checked OUT: "+checkOut);
	}
    public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getItemId(){
		return itemId;
	}
	public void setItemId(String itemId){
		this.itemId=itemId;
	}
	public boolean isCheckOut(){
		return checkOut;
	}
}