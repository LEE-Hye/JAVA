
public class Person {
	// 내가 원하는 사람을 만들 수 있는 설계도!
	
	// 클래스의 구조 :  필드, 메소드
	// 사람의 특징 : 나이, 이름, 성별, 키 . . .
	String name; 
	int age;
	String gender;
	int height;
	
	// 생성자
	// 단축키 : 우킬릭 -> source -> Generator Constructor using Fields
	// 		   : 우리가 선언해둔 필드를 이용해서 생성자 만들기
	// 생성자 특징
	// 1. 리턴 타입이 없음(void 자체도 없음)
	// 2. 생성자 메소드 이름은 클래스 이름과 동일
	// 3. 생성자는 new라는 키워드를 통해서만 호출할 수 있다.
	public Person(String name, int age, String gender, int height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
	
	// 4. 생성자 메소드는 오버로딩(중복정의)
	// 기본 생성자 또는 default 생성자라고 함
	// 객체 생성시 생성자가 없는 경우 compile할 때 기본 생성자가 자동으로 생성
	// But, 생성자가 하나 이상이 존재하면 기본 생성자는 자동생성 x
	public Person() {
		
	}


	// 사람의 행동 : 말하기, 먹기, 걷기, 자기 . . .
	public void talk() {
		System.out.println("재잘재잘 말하기~");
	}
	
	public void eat() {
		System.out.println("냠냠 먹기~");
	}
	
	public void walk() {
		System.out.println("뚜벅뚜벅 걷기. . 헥헥");
	}
	
	public void sleep() {
		System.out.println("쿨쿨 자기zzzZZ");
	}
	
}

