
public class ex03 {

	public static void main(String[] args) {
		
		int[] numArray = {11, 16, 13, 91, 54};

		// �迭 �ȿ� �ִ� �����͵� ��
		// ¦���� ��½����ּ���!
		int cnt = 0;
		
		System.out.print("¦���� ��½����ֱ� => ");
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i]%2 == 0) {
				cnt++;
				System.out.print(numArray[i]+" ");
			}
		}
		System.out.println();
		System.out.println("¦���� ���� : " + cnt );
	}

}
