package Ž��;

public class BinarySearch {

	public static void main(String[] args) {

		int[] array = { 2, 5, 8, 12, 15, 18, 20, 23, 25 };

		int target = 24;
		int start = 0;
		int end = array.length - 1;
		int mid = (start + end) / 2;

		while (true) {
			if (array[mid] == target) {
				System.out.println(mid + "��°�� �ִ�.");
				break;
			} else if (array[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = (start + end) / 2;

			if(start > end) {
				System.out.println("��ã�ҽ��ϴ�.");
				break;
			}
		}
	}

}
