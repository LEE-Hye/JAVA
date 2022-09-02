
public class ex04_숫자출력3 {

	public static void main(String[] args) {

		// 배열 선언
		int[][] arr = new int[5][5];

		int cnt = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = cnt++;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >=0; j--) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
