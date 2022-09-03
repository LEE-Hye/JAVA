import java.util.Arrays;

public class ex09_배열출력 {

	public static void main(String[] args) {
		
		int[] array = {1,3,4,8,7,9,10};
		arrayToString(array);

	}

	public static void arrayToString(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}

		System.out.println();
		// Arrays 클래스의 toString() 메소드 사용
		System.out.println(Arrays.toString(array));
		
		
	}

}
