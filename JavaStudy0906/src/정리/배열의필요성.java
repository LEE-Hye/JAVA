package ����;

import java.util.Scanner;

public class �迭���ʿ伺 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID�Է� >> ");
		String newID = sc.next();

		String id1 = "person1";
		String pw1 = "person1";
		
		String id2 = "person2";
		String pw2 = "person2";
		
		String id3 = "person3";
		String pw3 = "person3";

		if(newID.equals(id1)||newID.equals(id2)||newID.equals(id3)) {
			System.out.println("�ߺ��� ���̵��Դϴ�. �ٸ� ���̵�� �Է����ּ���");
		}else{
			System.out.println("������ �� �ִ� ���̵��Դϴ�.");
		}
		
		// 3���� ���̵�� �ϳ��ϳ� ������ �� ������
		// 500���̶��? ��� �����ǰ�
		// �̶� �迭�� ������ ���� ���� ��
		
	}

}
