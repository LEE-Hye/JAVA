package OOP;

public class Student {

	String name;			// 이름
	String number;		// 학번
	int age;					// 나이
	int scoreJava;		// Java 점수
	int scoreWeb;		// Web 점수
	int scoreAndroid;	// Android 점수

	// public(모두 접근할 수 있게끔 허용하겠다.) -> 접근 제한자
	public int avg() {
		int result = (scoreAndroid+scoreJava+scoreWeb)/3;
		return result;
	}
	
	public void show() {
		
		System.out.println(name + "님 안녕하세요.");
		System.out.println("[" + number + ", " + age +"살]");
		System.out.println(name + "님의 Java점수는 " + scoreJava + "점 입니다.");
		System.out.println(name + "님의 Web점수는 " + scoreWeb + "점 입니다.");
		System.out.println(name + "님의 Android점수는 " + scoreAndroid + "점 입니다.");
	}
	

}
// 접근 제한자
// public  -> 모두(어느곳에서든)
// protected -> 같은 패키지 내에서만! => 상속 관계 포함
// private -> 같은 클래스 내에서만!
// default -> 같은 패키지 내에서만! => 상속 관계 포함x
