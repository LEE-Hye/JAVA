
public class ex01_�л�����_��� {

	public static void main(String[] args) {

		// �л� 3���� ��, ��, ��, ��, ���� ������ ������ �迭�� ����
		// �� �л��� ��� ���� ���

		int[][] stuScore = { { 65, 14, 10, 50, 100 }, { 80, 40, 60, 87, 79 }, { 100, 10, 10, 100, 10 } };
		// ���� = ����
		// �л� = ��
		// �л��� ��� ���� = ��

		// 0��° �л� ����
		for (int k = 0; k < stuScore.length; k++) {
			int sum = 0;
			System.out.print(k + 1 + "��° �л� ���� : ");
			for (int i = 0; i < stuScore[k].length; i++) {
				System.out.print(stuScore[k][i] + " ");
				sum += stuScore[k][i];
			}
			System.out.println();
			System.out.println(k+1 + "��° �л��� ��� : " + sum/5);
			System.out.println();
		}
	}
}
