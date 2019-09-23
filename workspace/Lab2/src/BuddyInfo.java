
public class BuddyInfo {

	private int phone_number;
	private String name;
	private String address;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		BuddyInfo buddy = new BuddyInfo("Buddy",555555,"89 whatever lane");
		
		System.out.println("Hello " + buddy.getName());
	}
	
	public BuddyInfo(String name, int phone_number, String address){
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
