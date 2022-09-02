
public class ex02_숫자출력1 {
	public static void main(String[] args) {

		// 1 ~ 25까지 숫자를 담을 5행 5열의 이차원 배열을 생성
//		int[][] arr = { { 1, 2, 3, 4, 5 }, 
//								  { 6, 7, 8, 9, 10 }, 
//								  { 11, 12, 13, 14, 15 }, 
//								  { 16, 17, 18, 19, 20 },
//								  { 21, 22, 23, 24, 25 } };
		int[][] arr = new int[5][5];
		
		int cnt = 1;
		for(int i = 0; i <5; i++) {
			for(int j = 0; j < 5; j++) {
				arr[i][j] = cnt++;
			}
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		
	}
}
