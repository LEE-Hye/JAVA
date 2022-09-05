
public class PersonMain {

	public static void main(String[] args) {

		// Person 설계도로부터 객체가 만들어지는 곳
		
		// 설계도 불러오기(p1, p2라는 객체 만들기)
		// (소괄호 붙어 있으니 Person()은 메소드이다.)
		Person p1 = new Person();
		Person p2 = new Person();
		
		// p1과 p2에 이름, 나이, 성별, 키를 지정
		p1.name = "홍길동";
		p1.age = 24;
		p1.gender =  "여자";
		p1.height = 170;
		
		p2.name = "김이박";
		p2.age = 21;
		p2.gender =  "남자";
		p2.height = 193;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.gender);
		System.out.println(p1.height);

		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.gender);
		System.out.println(p2.height);
		
		Person p3 = new Person("장동현", 21, "남자", 188);
		
		p1.eat();
		p1.talk();
		p1.sleep();
		p1.walk();
	}

}
