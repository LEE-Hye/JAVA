import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		// 두개의 정수를 입력받아 두 수의 더하기, 빼기, 곱하기, 나누기(몫) 결괏값을 출력하세요
		
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수를 입력해주세요 : ");
		int num1 =  sc.nextInt();
		System.out.print("두 번째 정수를 입력해주세요 : ");
		int num2 = sc.nextInt();

		System.out.println("===================");
		
		int plus = num1 + num2;
		int minus = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		System.out.println("두 수의 더하기 : " + plus);
		System.out.println("두 수의 빼기 : " + minus);
		System.out.println("두 수의 곱하기 : " + mul);
		System.out.println("두 수의 나누기(몫) : " + div);
		
		sc.close();
	}

}
