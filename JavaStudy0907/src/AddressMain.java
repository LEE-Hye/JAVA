import java.util.ArrayList;

public class AddressMain {

	public static void main(String[] args) {


//		Address ad1 = new Address("�Ÿ�ȣ", 1, "010-1234-5678");
//		Address ad2 = new Address("�����", 2, "010-4321-5678");
//		Address ad3 = new Address("������", 3, "010-4321-8765");
//		Address ad4 = new Address("������", 4, "010-5678-1234");
//		Address ad5 = new Address("���ҿ�", 5, "010-8765-4321");

		ArrayList<Address> address = new ArrayList<Address>();
		address.add(new Address("�Ÿ�ȣ", 1, "010-1234-5678"));
		address.add(new Address("�����", 2, "010-4321-5678"));
		address.add(new Address("������", 3, "010-4321-8765"));
		address.add(new Address("������", 4, "010-5678-1234"));
		address.add(new Address("���ҿ�", 5, "010-8765-4321"));
		
		
		// 1. name(tel) ���� �� : mail
		
		
		String name = address.get(0).getName();
		int mail = address.get(0).getMail();
		String tel = address.get(0).getTel();
	}

}
