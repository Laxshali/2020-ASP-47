class Book extends LibraryItem{
	private String author;
	private int numPages;
	
	public Book(String title,String itemId,String author,int numPages){
		super(title,itemId);
		this.author=author;
		this.numPages=numPages;
	}
	public void displayItemDetails(){
		super.displaiItemDetails();
		System.out.println("Author: "+ author);
		System.out.println("numPages : "+numPages);
	}
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public int getNumPages(){
		return numPages;
	}
	public void setNumPages(int numPages){
		this.numPages=numPages;
	}
}