
public class ex03 {

	public static void main(String[] args) {
		
		int[] numArray = {11, 16, 13, 91, 54};

		// �迭 �ȿ� �ִ� �����͵� ��
		// ¦���� ��½����ּ���!
		
		System.out.println("¦���� ��½����ֱ�");
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i]%2 == 0) {
				System.out.print(numArray[i]+" ");
			}
		}
	}

}
