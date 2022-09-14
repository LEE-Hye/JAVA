package 정렬;

public class BubbleSort {

	public static void main(String[] args) {

		// 키오스크 만드는 작업
		// 그런데 사용자가 배열 데이터를 추가하거나 삭제한다?
		// 개발자가 미리 데이터를 다 넣어놓고 시작, 데이터의 개수에 제한이 있다?

		String[] fruits = { "포도", "사과", "복숭아", "키위", "메론" };

		for (int i = 0; i < fruits.length - 1; i++) {
			for (int j = 0; j < fruits.length - i - 1; j++) {
				if (fruits[j].compareTo(fruits[j + 1]) > 0) {
					String temp = fruits[j];
					fruits[j] = fruits[j+1];
					fruits[j+1] = temp;
				}
			}
		}

		for(String temp : fruits) {
			System.out.println(temp + " ");
		}
		
	} // main

} // class
