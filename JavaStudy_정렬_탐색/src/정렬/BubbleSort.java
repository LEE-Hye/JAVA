package ����;

public class BubbleSort {

	public static void main(String[] args) {

		// Ű����ũ ����� �۾�
		// �׷��� ����ڰ� �迭 �����͸� �߰��ϰų� �����Ѵ�?
		// �����ڰ� �̸� �����͸� �� �־���� ����, �������� ������ ������ �ִ�?

		String[] fruits = { "����", "���", "������", "Ű��", "�޷�" };

		for (int i = 0; i < fruits.length - 1; i++) {
			for (int j = 0; j < fruits.length - i - 1; j++) {
				if (fruits[j].compareTo(fruits[j + 1]) > 0) {
					String temp = fruits[j];
					fruits[j] = fruits[j+1];
					fruits[j+1] = temp;
				}
			}
		}

		for(String temp : fruits) {
			System.out.println(temp + " ");
		}
		
	} // main

} // class
