
public class ContactMain {

	public static void main(String[] args) {

		Contact ct = new Contact ("Lee", 20, "010-1234-5678");

		String name = ct.getName();
		int age = ct.getAge();
		String tel = ct.getTel();
		
		// %s�� �빮�ڷ� ������ �����͵� �빮�ڷ� �ٲ��
		System.out.printf("%S(%d��) :  %s" , name, age, tel);
	}

}
