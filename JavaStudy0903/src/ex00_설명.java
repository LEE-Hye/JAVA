
public class ex00_���� {
	public static void main(String[] args) {

		// ȸ��
		sum(5, 10);

		System.out.println(5 + 10 + 2);
		System.out.println(54 + 110 + 2);
		System.out.println(58 + 10 + 2);
		System.out.println(5 + 15 + 2);
		System.out.println(71 + 1052 + 2);
	}

	// �޼ҵ��� ����
	// ���� ������ : public - � Ŭ���������� ���� ������ ������
	// static : ���� ����
	// ���� Ÿ�� : return Ű���� �� ����ϱ� (����Ÿ��x : void)
	// �޼ҵ� �̸�(�Ű�����)

	// �޼ҵ� �ʿ伺
	// - �ݺ������� ���Ǵ� �ڵ带 ���̱� ���� ��: ���� ȿ�����̰�, ���� �������� �ڵ�
	// - ����,������ ���� : ū �Ը��� ���α׷����� �߻��ϴ� �������� ���������ϰ� �ذ��� �� �ִ�.

	public static void sum(int a, int b) {

		int result = a + b + 2;
		System.out.println(result);
	}
}
