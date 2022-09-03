import java.util.Scanner;

public class ex08_가까운수 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	      
	      System.out.print("첫 번째 정수 : ");
	      int num1 = sc.nextInt();
	      
	      System.out.print("두 번째 정수 : ");
	      int num2 = sc.nextInt();
	      int result = close10(num1, num2);
	      System.out.println("10에 가까운 수 : " + result);
	      
	   }
	   
	   public static int close10(int num1, int num2) {
	      
	      int a = 10 - num1;
	      int b = 10 - num2;
	      
	      // 1. 어떤 수가 10보다 가까운지 모르기 때문에 음수를 양수로 바꿔주기
	      if(a < 0) {
	         a *= -1;
	      }
	      if(b < 0) {
	         b *= -1;
	      }
	      // 1-2. Math 클래스 안에있는 메소드 이용하기 -> abs();
	      // int a = Math.abs(10 - num1);
	      // int b = Math.abs(10 - num2);
	      
	      // 2. 10으로부터 더 가까운수 구하기
	      if(a > b) {
	         return num2;
	      }else if(a < b) {
	         return num1;
	      }else {
	         return 0;
	      }   

		

		
	}
	

}
