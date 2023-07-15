class Magazine extends LibraryItem{
	private String issueDate;
	private String publisher;
	
	public Magazine(String title,String itemId,String issueDate,String publisher){
		super(title,itemId);
		this.issueDate=issueDate;
		this.publisher=publisher;
	}
	public void displayItemDetails(){
		super.displayItemDetails();
		System.out.println("IssueDate: "+ issueDate);
		System.out.println("Publisher: "+publisher);
	}
	public String getIssueDate(){
		return issueDate;
	}
	public void setIssueDate(String issueDate){
		this.issueDate=issueDate;
	}
	public String getPublisher(){
		return publisher;
	}
	public void setPublisher(String publisher){
		this.publisher=publisher;
	}
}