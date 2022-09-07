import java.util.ArrayList;

public class AddressMain {

	public static void main(String[] args) {


//		Address ad1 = new Address("신명호", 1, "010-1234-5678");
//		Address ad2 = new Address("김명현", 2, "010-4321-5678");
//		Address ad3 = new Address("이혜빈", 3, "010-4321-8765");
//		Address ad4 = new Address("전수현", 4, "010-5678-1234");
//		Address ad5 = new Address("나소영", 5, "010-8765-4321");

		ArrayList<Address> address = new ArrayList<Address>();
		address.add(new Address("신명호", 1, "010-1234-5678"));
		address.add(new Address("김명현", 2, "010-4321-5678"));
		address.add(new Address("이혜빈", 3, "010-4321-8765"));
		address.add(new Address("전수현", 4, "010-5678-1234"));
		address.add(new Address("나소영", 5, "010-8765-4321"));
		
		
		// 1. name(tel) 번지 수 : mail
		
		for(int i = 0; i < address.size(); i++) {
			String name = address.get(i).getName();
			int mail = address.get(i).getMail();
			String tel = address.get(i).getTel();
			
			System.out.printf("%d. %s(%s) 번지수 : %s", i+1, name, tel, mail);
			System.out.println();
		}
		
	}

}
