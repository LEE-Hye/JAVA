import java.util.Arrays;

public class ex04_���ڰ��� {

	public static void main(String[] args) {

		// .split() : Ư�� ���ڸ� �������� ���ڿ��� �߶��ִ� �Լ�

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
		System.out.println("A : " + cntA + "��");
		System.out.println("B : " + cntB + "��");
		System.out.println("C : " + cntC + "��");
		System.out.println("D : " + cntD + "��");
		System.out.println("F : " + cntF + "��");

	}

}
