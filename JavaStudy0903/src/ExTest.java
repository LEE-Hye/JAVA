
public class ExTest {

	public static void main(String[] args) {

		int num = 10;
		int[] numArray = {10, 20};
		
		ch1(num);
		ch2(numArray);
		
		System.out.println(num);
		System.out.println(numArray[0]);

	}
	// call-by-value
	public static void ch1(int num) {
		num = 30;
	}
	// call-by-reference
	public static void ch2(int[] numArray ) {
		numArray[0] = 30;
	}

}
