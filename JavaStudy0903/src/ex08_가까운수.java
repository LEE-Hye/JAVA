import java.util.Scanner;

public class ex08_������ {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	      
	      System.out.print("ù ��° ���� : ");
	      int num1 = sc.nextInt();
	      
	      System.out.print("�� ��° ���� : ");
	      int num2 = sc.nextInt();
	      int result = close10(num1, num2);
	      System.out.println("10�� ����� �� : " + result);
	      
	   }
	   
	   public static int close10(int num1, int num2) {
	      
	      int a = 10 - num1;
	      int b = 10 - num2;
	      
	      // 1. � ���� 10���� ������� �𸣱� ������ ������ ����� �ٲ��ֱ�
	      if(a < 0) {
	         a *= -1;
	      }
	      if(b < 0) {
	         b *= -1;
	      }
	      // 1-2. Math Ŭ���� �ȿ��ִ� �޼ҵ� �̿��ϱ� -> abs();
	      // int a = Math.abs(10 - num1);
	      // int b = Math.abs(10 - num2);
	      
	      // 2. 10���κ��� �� ������ ���ϱ�
	      if(a > b) {
	         return num2;
	      }else if(a < b) {
	         return num1;
	      }else {
	         return 0;
	      }   

		

		
	}
	

}
