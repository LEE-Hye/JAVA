import java.util.Scanner;

public class ex07_큰수출력 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		int result = largerNumbers(num1, num2);
		System.out.println("큰 수 확인 : " + result);

	}

	public static int largerNumbers(int num1, int num2) {
		
		int result = 0;
		
//		if(num1 > num2 ) {
//			result = num1;
//		}else if(num1 < num2) {
//			result = num2;
//		}else {
//			result = 0;
//		}
		if(num1==num2) {
			return 0;
		}else {
		result =  num1 > num2 ? num1 : num2;
		}
		
		return result;
	}

}
