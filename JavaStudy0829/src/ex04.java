
public class ex04 {

	public static void main(String[] args) {
		 // 1~100 �� 3�� ����� ���� ���
	      int result = 0;
	      for (int i = 1; i <= 100; i++) {
	         if (i % 3 != 0) {
	            System.out.print(i + " ");
	            result += i;  // 3�� ���
	         }
	      }
	      System.out.println();
//	      System.out.println("3�� ����� �ƴҶ��� �� >> " + result); // 3�� ��� �� ���
	}

}
