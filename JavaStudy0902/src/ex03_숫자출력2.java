
public class ex03_�������2 {

	public static void main(String[] args) {

		// 5�� 5���� �迭 ����
		int[][] arr = new int[5][5];

		
		// �Էº�
		int cnt = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = cnt++;
			}
		}

		// ��º�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
