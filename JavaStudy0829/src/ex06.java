import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		 // �� ���� �ڿ����� �Է¹޾� �� ���� ����� ���ʷ� 10�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	      Scanner sc = new Scanner(System.in);
	      System.out.print("���ڸ� �Է����ּ��� >> ");
	      int num = sc.nextInt();
	      
	      for(int i = 1; i<=10;i++) {
	         System.out.print(num*i + " ");
	      }

	}

}
