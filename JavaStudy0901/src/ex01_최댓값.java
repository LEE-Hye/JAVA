
public class ex01_�ִ� {

	public static void main(String[] args) {
		
		// 1���� ������ �迭�� ������ �� ������ ������ �ʱ�ȭ
		int array[] = {5,1,7,3,4,2};
		
		// �迭�� �� �� ���� ū ���� ���
		// �ִ� ���� = max
		int max = 0;
//		if(array[0] > max) {
//			max = array[0];
//		}
//		if(array[1] > max) {
//			max = array[1];
//		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
			
		}
				
		// System.out.println("���� ū ���� " + max + "�Դϴ�.")
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		
		
		// alt + shift + r : ���� �� �� �ٲٱ�
	}

}
