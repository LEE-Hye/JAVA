
public class ex03 {

	public static void main(String[] args) {
		// num1, num2 ������ ���� ��
		// num1 -> 10, num2 -> 3
		// ���� ��� :
		// �� ��� :
		// ���� ��� :
		int num1 = 10;
		int num2 = 3;
		
		// ������ �����ڸ��� �켱 ������ �ִ�
		// ���а� ����
		System.out.println("���� ��� : " + (num1 + num2));
		// ���ڿ� - ���ڴ� JAVA���� ������� �ʴ´�.
		System.out.println("�� ��� : " + (num1 - num2));
		System.out.println("���� ��� : " + (num1 * num2));
		// ���� �� ���
		// ������ ���
		// (������ų �ڷ���) ������ --> ������ ������ ����ȯ��Ű�ڽ��ϴ�.
		System.out.println("���� �� ��� : " + ((float)num1/num2));
		System.out.println("������ ��� : " + (num1%num2));
		
		int  number1 = 10;
		String number2 = "3"; // String -> reference Ÿ��
		// "abc" --> 'a', 'b', 'c'
		// 13 ����ϰ� �;�!
		// String -> int : Integer.parseInt('�ٲٰ� ���� ���ڿ�');
		System.out.println(number1 + Integer.parseInt(number2));
	}

}
