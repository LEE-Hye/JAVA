
public class ex01 {

	public static void main(String[] args) {
		
		// �迭 : �������� ������(���� Ÿ��)�� �ϳ��� ��� �����ϴ� ��!
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		// �迭 ���� 1.
		// new : ����ڴ�! �����ϰڴ�!
		// Ÿ��[] �迭�� = new Ÿ��[�迭�� ũ��]
		int[] numArray = new int[4];
		// numArray[index]
		// index => 0���� ����! ~ �迭�� ũ�� -1
		// JAVA������ �迭�� ũ�Ⱑ �������̴�!!
		// �迭 ������ Ÿ�Ը� �����ͷ� ������ �� �ִ�!
		numArray[0] = 10;
		numArray[1] = 20;
		numArray[2] = 30;
		numArray[3] = 40;
		// numArray[4] = 50;
		
		// numArray�� �̿��ؼ� ������ 30�� ����ϰ� �ʹ� 
		System.out.println(numArray[3]);
		
		
		// �迭 ���� 2.
		// �迭�� ũ��� �����͸� �� ���� ������ �� �ִ�!
		int[] numArray2 = {50, 60, 70, 80};
		// numArray2�� �̿��ؼ� ������ 70�� ����ϰ� �ʹ�
		System.out.println(numArray2[2]);
		
		System.out.println("��� ������ ������ּ���!");
		// numArray2�� �ִ� ��� �����͸� ��� �����ּ���!
		// �迭��.length ==> �迭�� ũ�⸦ �ǹ�
		for(int i = 0; i <= numArray2.length; i++) {
			System.out.print(numArray2[i]+ " ");
		}
		
		
		// String -> ���ڿ�
		String name = "��ȯ";
		
	}

}
