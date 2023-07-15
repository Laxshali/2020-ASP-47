class LibraryMember{
	private String memberId;
	private String name;
	
	public LibraryMember(String memberId,String name){
		this.memberId=memberId;
		this.name=name;
	}
	
	public void displayMemberDetails(){
		System.out.println("MemberId: "+memberId);
		System.out.println("Name: "+name);
	}
	public String getMemberId(){
		return memberId;
	}
	public void setMemberId(String memberId){
		this.memberId=memberId;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
}