package buildup;

public class ex01_Divide0 {

	public static void main(String[] args) {
		
		// �ڹ��� ����
		// 1. ������ ���� : �������� ����
		System.out.println("��¹�");
		
		// 2. ��Ÿ�� ���� : �������� ������ �ƴ����� ���� �� ��Ÿ���� ����
		// try : ���� ó���� �������ִ� ����
		// catch : ���ܰ� �߻����� �� catch������ ������ ����ִ� ����
		
		try {
			
		System.out.println(100/0);
		}catch(ArithmeticException e){
			System.out.println("������ ������ �����ϴ�!");
		}

		System.out.println("���� �ڵ�");
	}

}
