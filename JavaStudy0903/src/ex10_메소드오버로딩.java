
public class ex10_�޼ҵ�����ε� {

	public static void main(String[] args) {
		
		add(5,10);
		add1(2,1.5);
		add2(5,1.5,1);

	}


	// �޼ҵ� �����ε�? ==> �ߺ�����
	// => ���� �޼ҵ� �̸����� �Ű������� �ٸ��� �������ν�
	// �ٸ� ����� �� �� �ְ� ����� ��
	// �޼ҵ� �̸��� �������
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void add1(int a, double b) {
		System.out.println(a + b);
		
	}

	private static void add2(int a, double b, int c) {
		System.out.println(a + b + c);
		
	}
}
