
public class ContactMain {

	public static void main(String[] args) {

		Contact ct1 = new Contact ("�Ÿ�ȣ", 23, "010-1745-2788");
		Contact ct2 = new Contact ("�����", 22, "010-6450-5798");
		Contact ct3 = new Contact ("������", 21, "010-7086-4056");
		Contact ct4 = new Contact ("���ҿ�", 20, "010-5464-7860");

		Contact[] contact = {ct1, ct2, ct3, ct4}; 
		
		for(int i = 0; i < contact.length; i++) {
			String name = contact[i].getName();
			int age = contact[i].getAge();
			String tel = contact[i].getTel();
			System.out.printf("%s(%d��) :  %s%n" , name, age, tel);
		}

	}

}
