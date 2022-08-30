import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		      // 정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는 프로그램을 작성하시오
		      Scanner sc= new Scanner(System.in);
		      System.out.print("정수 입력 >> ");
		      int num=sc.nextInt();
		      sc.close();
		      
		      //1~ 입력받은 숫자까지 출력!
		      for(int i=1;i<=num;i++) {
		         System.out.print(i + " ");
		      }

	}

}
