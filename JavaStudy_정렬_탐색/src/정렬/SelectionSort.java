package ����;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = { 8, 5, 3, 7, 2 };

		for (int target = 0; target < array.length - 1; target++) {

			// target���� �������� ���ϸ鼭 ���� ū ���� �ε��� ã��
			int maxIndex = target; // maxIndex => ���� ���ݱ��� �˰� �ִ� ���� ū ���� �� ��ȣ
			for (int j = target + 1; j < array.length; j++) { // j => ū ���� ã�� ���� search��ȣ
				if (array[maxIndex] < array[j]) { // �������� ���ְ� ������ ���� �ε�ȣ�� �ٲ��ָ� ��
					maxIndex = j;
				}
			}
			
			if(maxIndex != target) { // ���� ã�� ū ���� �ε����� �ùٸ��� �ʴٸ�
				int temp = array[maxIndex];
				array[maxIndex] = array[target];
				array[target] = temp;
			}

		}
		for(int temp : array) {
			System.out.println(temp + " ");
		}

	}

}
