
public class ContactMain {

	public static void main(String[] args) {

		Contact ct = new Contact ("Lee", 20, "010-1234-5678");

		String name = ct.getName();
		int age = ct.getAge();
		String tel = ct.getTel();
		
		// %s를 대문자로 적으면 데이터도 대문자로 바뀐다
		System.out.printf("%S(%d세) :  %s" , name, age, tel);
	}

}
