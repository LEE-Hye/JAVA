package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ex02_Team {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> team = new ArrayList<String>();

				for(int i = 0; i < 5; i++) {
					System.out.print("�̸��� �Է��ϼ��� : ");
					team.add(i,sc.next());
				}
				
				// ���
				System.out.print("�������� ������ ");
				for (int i = 0; i < team.size(); i++) {
					System.out.print(team.get(i) + " ");
				}
				System.out.println("�Դϴ�.");
				System.out.println();
				
				// �� �����ϱ�
				// 1. ������ ������ �̸��� �Է¹ޱ�
				System.out.print("������ ������ �̸��� �Է����ּ��� : ");
				String team_name = sc.next();
				// 2. �Է¹��� �̸���  team�� �ִٸ�, �ش� �̸� �����ϱ�
				for(int i = 0; i < team.size(); i++) {
					if(team_name.equals(team.get(i))) {
						team.remove(i);
						System.out.println(team_name + "���� ����ƽ��ϴ�.");
					}
				}
				// ���
				System.out.print("�������� ������ ");
				for (int i = 0; i < team.size(); i++) {
					System.out.print(team.get(i) + " ");
				}
				System.out.println("�Դϴ�.");
				
				
				
	}

}
