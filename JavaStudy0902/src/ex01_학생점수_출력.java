
public class ex01_학생점수_출력 {

	public static void main(String[] args) {

		// 학생 3명의 국, 영, 수, 사, 과의 점수를 저장할 배열을 생성
		// 각 학생의 평균 점수 출력

		int[][] stuScore = { { 65, 14, 10, 50, 100 }, { 80, 40, 60, 87, 79 }, { 100, 10, 10, 100, 10 } };
		// 점수 = 변수
		// 학생 = 행
		// 학생의 모든 점수 = 열

		// 0번째 학생 점수
		for (int k = 0; k < stuScore.length; k++) {
			int sum = 0;
			System.out.print(k + 1 + "번째 학생 점수 : ");
			for (int i = 0; i < stuScore[k].length; i++) {
				System.out.print(stuScore[k][i] + " ");
				sum += stuScore[k][i];
			}
			System.out.println();
			System.out.println(k+1 + "번째 학생의 평균 : " + sum/5);
			System.out.println();
		}
	}
}
