import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
		int money;
		
		if(time > 8) {
			money = (int) (8*5000 + (time-8)*5000*1.5);
			System.out.println("�� �ӱ��� " + money + "�� �Դϴ�.");
		}
		else {
			money = time * 5000;
			System.out.println("�� �ӱ��� " + money + "�� �Դϴ�.");
		}

	}

}
