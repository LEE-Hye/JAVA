package OOP;

public class Student {

	String name;			// �̸�
	String number;		// �й�
	int age;					// ����
	int scoreJava;		// Java ����
	int scoreWeb;		// Web ����
	int scoreAndroid;	// Android ����

	// public(��� ������ �� �ְԲ� ����ϰڴ�.) -> ���� ������
	public int avg() {
		int result = (scoreAndroid+scoreJava+scoreWeb)/3;
		return result;
	}
	
	public void show() {
		
		System.out.println(name + "�� �ȳ��ϼ���.");
		System.out.println("[" + number + ", " + age +"��]");
		System.out.println(name + "���� Java������ " + scoreJava + "�� �Դϴ�.");
		System.out.println(name + "���� Web������ " + scoreWeb + "�� �Դϴ�.");
		System.out.println(name + "���� Android������ " + scoreAndroid + "�� �Դϴ�.");
	}
	

}
// ���� ������
// public  -> ���(�����������)
// protected -> ���� ��Ű�� ��������! => ��� ���� ����
// private -> ���� Ŭ���� ��������!
// default -> ���� ��Ű�� ��������! => ��� ���� ����x
