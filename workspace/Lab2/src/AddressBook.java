import java.util.HashMap;
//Code added on new branch!
public class AddressBook {
	
	private HashMap<String, BuddyInfo> buddyList;
	
	public AddressBook(){
		buddyList = new HashMap<String, BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo buddy){
		buddyList.put(buddy.getName(), buddy);
	}
	
	public void removeBuddy(String name){
		buddyList.remove(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		AddressBook address = new AddressBook();
		BuddyInfo buddy = new BuddyInfo("Bob", 613, "57 Cecil Carling");
		address.addBuddy(buddy);
		address.removeBuddy("Bob");
	}
}
