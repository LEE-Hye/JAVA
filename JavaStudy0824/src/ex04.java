
public class ex04 {

	public static void main(String[] args) {
		
		// 1. ���� ���� ������!! (+= , -=)
		
		int num1 = 10;
		int num2 = 30;
		
		num1 = num2 + 1; // num1 -> 31
		
		int num3 = 50;
		// num3�� num2�� ���� ���� ����ּ���! -> 80
		// num3 = num3+num2;
		num3 += num2; // ���� ���� ������(�ٷ� �� �����̶� ���� �ǹ���)
		System.out.println(num3);
		
		
		int num = 29;
		
		num -= 2 + 3 * 4;
		// num = num - (2 + 3 * 4);
		System.out.println(num);

		
		// 2. ���� ������! (++ , --)
		int num4 = 100;
		num4--; // num4 = num4 - 1; => ���� ������ :  �� ���� ������ �� ������ �ּ��� 
		System.out.println(++num4); // => ���� ������ : �� ���� �������� �� �����ϰ� ���� �� ������ �ּ���
	
		
		// 3. ���� ������! : ���� 3��! -> ���� �� ? �� �� : ���� ��
		System.out.println(10 < 5 ? "0" : "X");
	}

}
