package 정리;

public class Main {

	public static void main(String[] args) {

		// 1) 이름을 저장할 수 있는 배열 생성하고 팀원들 이름 저장하기
		String[] names = {"신명호", "김명현", "이혜빈", "전수현", "나소영"};
		
		// 2) 지금 먹고 싶은 음식 3개 저장하기
		String[] foods = new String[3];
		foods[0] = "샤브샤브";
		foods[1] = "아구찜";
		foods[2] = "칼국수";
		
		foods = names ; // 1. names는 5칸, foods는 3칸 이거 되나?
		
		foods[4] = "참치회"; // 2. foods는 3칸, 이거 됨??
		
		System.out.println(foods[4]); // 3. 뭐가 나옴? 왜?
		
		System.out.println(foods);
		System.out.println(names);
		
		// for-each문, 확장 for문
		// - 배열에 특화된 for문
		for(String temp : names) {
			System.out.println(temp);
		}
	}

}
