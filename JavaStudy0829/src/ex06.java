import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		 // 한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하시오.
	      Scanner sc = new Scanner(System.in);
	      System.out.print("숫자를 입력해주세요 >> ");
	      int num = sc.nextInt();
	      
	      for(int i = 1; i<=10;i++) {
	         System.out.print(num*i + " ");
	      }

	}

}
