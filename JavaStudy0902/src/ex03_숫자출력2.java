
public class ex03_숫자출력2 {

	public static void main(String[] args) {

		// 5행 5열의 배열 생성
		int[][] arr = new int[5][5];

		
		// 입력부
		int cnt = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = cnt++;
			}
		}

		// 출력부
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
