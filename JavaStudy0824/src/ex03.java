import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		// JAVA, Web, Android ������ ����ڷκ��� Ű����� �Է� �޾� �հ�� ����� ����ϼ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA ������ �Է��ϼ��� : ");
		int java = sc.nextInt();
		
		System.out.print("Web ������ �Է��ϼ��� : ");
		int web = sc.nextInt();
		
		System.out.print("Android ������ �Է��ϼ��� : ");
		int android = sc.nextInt();
		
		int hab = java + web + android;
		int avg = hab/3;
		
		System.out.println("=====================");
		System.out.println("������ �հ�� " + hab + "�� �Դϴ�.");
		System.out.println("������ ����� " + avg + "�� �Դϴ�.");

		sc.close();
	}

}
