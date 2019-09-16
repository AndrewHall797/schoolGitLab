import java.util.HashMap;

public class AddressBook {
	
	private HashMap<String, BuddyInfo> buddyList;
	
	public AddressBook(){
		buddyList = new HashMap<String, BuddyInfo>();
	}
	
	public void addBuddy(String name, int phone_number, String address){
		BuddyInfo buddy = new BuddyInfo(name, phone_number, address);
		buddyList.put(name, buddy);
	}
	
	public void removeBuddy(String name){
		buddyList.remove(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
	}
}
