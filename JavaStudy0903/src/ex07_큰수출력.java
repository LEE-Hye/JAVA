import java.util.Scanner;

public class ex07_ū����� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		int result = largerNumbers(num1, num2);
		System.out.println("ū �� Ȯ�� : " + result);

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
