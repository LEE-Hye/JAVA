
public class ex01_최댓값 {

	public static void main(String[] args) {
		
		// 1차원 정수형 배열을 선언한 후 임의의 값으로 초기화
		int array[] = {5,1,7,3,4,2};
		
		// 배열의 값 중 가장 큰 값을 출력
		// 최댓값 변수 = max
		int max = 0;
//		if(array[0] > max) {
//			max = array[0];
//		}
//		if(array[1] > max) {
//			max = array[1];
//		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
			
		}
				
		// System.out.println("가장 큰 수는 " + max + "입니다.")
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		
		// alt + shift + r : 같은 값 다 바꾸기
	}

}
