package ArrayList;

import java.util.ArrayList;

public class ex01_ArrayList {

	public static void main(String[] args) {


		// 1. 선언 및 생성
		// 배열
		int[] arr = new int[5];

		// ArrayList(가변리스트)
		// 제네릭기법
		// ArrayList<데이터타입> 변수명 = new ArrayList<데이터타입>();
		// - 클래스 형태이기 때문에 import 해야함
		// () : 메소드를 사용해서 생성
		// 데이터 타입 -> 객체타입으로 존재. int -> Integer
		// 생성 시에 크기 지정X
		ArrayList<Integer> arrList = new ArrayList<Integer>();

		System.out.println("배열의 길이 : " + arr.length);
		System.out.println("ArrayList 길이 : " + arrList.size());

		// 2. 값 추가
		// 배열
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;

		// ArrayList -> 변수명.add(값);
		// -> 변수명.add(인덱스, 값);
		arrList.add(0);
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		System.out.println("값 추가 후 ArrayList 크기 : " + arrList.size());

		// 3. 값 조회
		// 배열
		System.out.println("배열 0번째 : " + arr[0]);

		// ArrayList
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println("ArrayList " + i + "번째 : " + arrList.get(i));
		}

		// 4. 값 삭제
		// ArrayList -> 변수명.remove(인덱스);
		// -> 변수명.clear(); , 변수명.removeAll();
		arrList.remove(2);
		System.out.println(arrList.get(2));

		arrList.clear();
		System.out.println(arrList.size());

	}

}
//<ArrayList>
//1. 선언 및 생성
//- ArrayList<데이터타입> 변수명 = new ArrayList<데이터타입>();
//
//2. 값 추가
//- 변수명.add(값);
//- 변수명.add(인덱스, 값);
//
//3. 값 조회
//- 변수명.get(인덱스);
//
//4. 값 삭제
//- 변수명.remove(인덱스);
//- 변수명.clear();
//
//5. ArrayList의 크기
//- 변수명.size()