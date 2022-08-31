import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		// int 타입의 데이터가 총 5개 들어갈 수 있는
		// numArray라는 배열 만들어주세요!
		int numArray[] = new int[5];
		
		// numArray라는 배열에
		// 사용자가 입력한 데이터로 배열을 채워주세요!
		Scanner sc = new Scanner(System.in);
//		System.out.print("내가 푼 것");
		System.out.print("5개의 숫자를 입력해주세요 : ");
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = sc.nextInt();
		}
		
//		System.out.println("다른 방법으로 숫자 저장");
//		for(int i = 0; i < numArray.length; i++) {
//			System.out.print(i + 1 + "번째 숫자 입력 : ");
//			numArray[i] = sc.nextInt();
//		}

		// 배열에 있는 데이터를 출력 시켜주세요
		System.out.print("배열에 있는 데이터 출력 : ");
		for(int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");
		}
	}

}
