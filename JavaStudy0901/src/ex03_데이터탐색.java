import java.util.Scanner;

public class ex03_������Ž�� {

	public static void main(String[] args) {
		
		String[] team = {"�Ÿ�ȣ", "�����", "������", "������","���ҿ�"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		for(int i = 0; i < team.length; i++) {
			if(name.equals(team[i])) {
				System.out.println(name + "���� " + i + "�� �ε����� �ֽ��ϴ�.");
			}
			else {
				System.out.println("�ӳ�");
				break;
			}
		}

		

	}

}
