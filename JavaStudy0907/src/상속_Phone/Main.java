package 상속_Phone;

public class Main {

	public static void main(String[] args) {
		
		// 동작!
		
		// 피쳐폰 객체 생성하기!
		// 주소가 생겨 이 주소로 메모리에 접근 하려고 레퍼런스 변수를 사용
		// 변수의 타입도 메모리의 타입이랑 동일하게 FeaturePhone = FeaturePhone()
		FeaturePhone p1 = new FeaturePhone();
		
		// 1. 상속을 받으면 상위 클래스의 속성과 기능을 모두 물려받음!		
		p1.call();
		p1.send();
		p1.sms();

		
		
		// 스마트폰 객체 생성하기!
		SmartPhone p2 = new SmartPhone();
		
		p2.call();
		p2.send();
		p2.sms();
		p2.wifi();
		
		 
		// 2. 상속 관계에서 하위 클래스 객체는 상위 클래스 타입으로 형변환이 가능하다.
		// => 업캐스팅
		new FeaturePhone();
		
		
		
	}

}
