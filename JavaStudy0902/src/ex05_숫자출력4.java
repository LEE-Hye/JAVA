
public class ex05_숫자출력4 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int cnt = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = cnt++;
			}
		}

		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					System.out.print(arr[i][j] + "\t");
				}
			}
			else {
				for (int j = 4; j >=0; j--) {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}

	}

}
