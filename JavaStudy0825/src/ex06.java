import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�ڱݾ��� �Է��ϼ����");
		int money = sc.nextInt();
		System.out.println("");
		System.out.println("�ڸ޴��� �������");
		System.out.print("1. �ݶ�(800��) 2. ����(500��) 3. ��Ÿ�ο���(1500��) >> ");
		int num = sc.nextInt();
		System.out.println("");

		// ��� 1. (���� Ǭ ��)
//		switch (num) {
//		case 1:
//			if (money < 800) {
//				System.out.println("���� �����ؿ�");
//				System.out.println("�ܵ� : " + money);
//			} else {
//				System.out.println("�ܵ� : " + (money - 800));
//			}
//			break;
//		case 2:
//			if (money < 500) {
//				System.out.println("���� �����ؿ�");
//				System.out.println("�ܵ� : " + money);
//			} else {
//				System.out.println("�ܵ� : " + (money - 500));
//			}
//			break;
//		case 3:
//			if (money < 1500) {
//				System.out.println("���� �����ؿ�");
//				System.out.println("�ܵ� : " + money);
//			} else {
//				System.out.println("�ܵ� : " + (money - 1500));
//			}
//			break;
//		}
		
		// ���2. �������� Ǭ ��
		int productMoeny = 0;
		
		if(num==1) {
			productMoeny = 800;
		}
		if(num==2) {
			productMoeny = 500;
		}
		if(num==3) {
			productMoeny = 1500;
		}
		
		if(money>=productMoeny) {
			int jandon = money-productMoeny;
			int cheon = jandon / 1000;
			int ohback = jandon % 1000 /500;
			int back = jandon % 500/100;
			System.out.println("���ܵ���");
			System.out.println(jandon);
			System.out.println("");
			System.out.println("�ڰŽ�������");
			System.out.println("õ�� : "+ cheon + "��, ����� : " + ohback + "��, ��� : " + back + "��");
			
		}
		else {
			System.out.println("�ݾ��� �����մϴ�.");
		}

	}

}
