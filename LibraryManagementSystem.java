class LibraryManagementSystem{
	public static void main(String[] args){
		Book B1=new Book("The catcher in the Rye","B001","J.D.Salinger",240);
		Book B2=new Book("To Kill a Mockingbird","B002","Harper Lee",281);
		Book B3=new Book("1984","B003","George Orwell",328);
		Book B4=new Book("Pride and Prejudice","B004","Jane Austen",432);
		Book B5=new Book("The Hobbit","B005","J.R.R.Tolkien",320);
		
		Magazine M1=new Magazine("National Geographic","M001","August 2023","National Geographic Society");
		Magazine M2=new Magazine("Time","M002","September 2023","Time USA,LLC");
		Magazine M3=new Magazine("Forbes","M003","June 2023","Forbes Media");
		Magazine M4=new Magazine("Vogue","M004","July 2023","Conde Nast");
		Magazine M5=new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");
		
		LibraryMember L1=new LibraryMember("L001","John Doe");
		LibraryMember L1=new LibraryMember("L002","Jane Smith");
		LibraryMember L1=new LibraryMember("L003","David Johnson");
		LibraryMember L1=new LibraryMember("L004","Sarah Williams");
		LibraryMember L1=new LibraryMember("L005","Michael Brown");
		
		B1.setAuthor("J.D.Salinger");
		B2.setAuthor("Harper Lee");
		B3.setAuthor("George Orwell");
		B4.setAuthor("Jane Austen");
		B5.setAuthor("J.R.R.Tolkien");
		
		B1.checkOut();
		B1.checkIn();
		
		System.out.println("Books details:");
		B1.displayItemDetails();
		B2.displayItemDetails();
		B3.displayItemDetails();
		B4.displayItemDetails();
		B5.displayItemDetails();
		
		System.out.println("\nMagazines details: ");
		M1.displayItemDetails();
		M2.displayItemDetails();
		M3.displayItemDetails();
		M4.displayItemDetails();
		M5.displayItemDetails();
		
		System.out.println("\nLibrary Members details:");
		L1.displayItemDetails();
		L2.displayItemDetails();
		L3.displayItemDetails();
		L4.displayItemDetails();
		L5.displayItemDetails();

	}
}