package ����;

public class Main {

	public static void main(String[] args) {

		// 1) �̸��� ������ �� �ִ� �迭 �����ϰ� ������ �̸� �����ϱ�
		String[] names = {"�Ÿ�ȣ", "�����", "������", "������", "���ҿ�"};
		
		// 2) ���� �԰� ���� ���� 3�� �����ϱ�
		String[] foods = new String[3];
		foods[0] = "�������";
		foods[1] = "�Ʊ���";
		foods[2] = "Į����";
		
		foods = names ; // 1. names�� 5ĭ, foods�� 3ĭ �̰� �ǳ�?
		
		foods[4] = "��ġȸ"; // 2. foods�� 3ĭ, �̰� ��??
		
		System.out.println(foods[4]); // 3. ���� ����? ��?
		
		System.out.println(foods);
		System.out.println(names);
		
		// for-each��, Ȯ�� for��
		// - �迭�� Ưȭ�� for��
		for(String temp : names) {
			System.out.println(temp);
		}
	}

}
