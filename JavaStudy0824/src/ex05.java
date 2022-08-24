import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		String holJJac =  num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
		
		System.out.println(num + "는(은) " + holJJac);

		sc.close();
	}

}
