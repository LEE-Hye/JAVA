import java.util.Arrays;

public class ex04_문자개수 {

	public static void main(String[] args) {

		// .split() : 특정 문자를 기준으로 문자열을 잘라주는 함수

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] arr = score.split(",");
		System.out.println(Arrays.toString(arr));

		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		int cntD = 0;
		int cntF = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals("A")) {
				cntA++;
			} else if (arr[i].equals("B")) {
				cntB++;
			} else if (arr[i].equals("C")) {
				cntC++;
			} else if (arr[i].equals("D")) {
				cntD++;
			} else{
				cntF++;
			}

		}
		System.out.println("A : " + cntA + "명");
		System.out.println("B : " + cntB + "명");
		System.out.println("C : " + cntC + "명");
		System.out.println("D : " + cntD + "명");
		System.out.println("F : " + cntF + "명");

	}

}
