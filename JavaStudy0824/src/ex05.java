import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		int num = sc.nextInt();
		
		String holJJac =  num % 2 == 0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		
		System.out.println(num + "��(��) " + holJJac);

		sc.close();
	}

}
