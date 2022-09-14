package 정렬;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = { 8, 5, 3, 7, 2 };

		for (int target = 0; target < array.length - 1; target++) {

			// target부터 끝번까지 비교하면서 가장 큰 수의 인덱스 찾기
			int maxIndex = target; // maxIndex => 내가 지금까지 알고 있는 가장 큰 수의 방 번호
			for (int j = target + 1; j < array.length; j++) { // j => 큰 수를 찾기 위한 search번호
				if (array[maxIndex] < array[j]) { // 오름차순 해주고 싶으면 여기 부등호를 바꿔주면 됨
					maxIndex = j;
				}
			}
			
			if(maxIndex != target) { // 내가 찾은 큰 수의 인덱스가 올바르지 않다면
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
