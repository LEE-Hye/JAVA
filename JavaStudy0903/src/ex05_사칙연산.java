
public class ex05_사칙연산 {

	public static void main(String[] args) {
		
		add(1,5);
		sub(5,10);
		mul(1835,234);
		div(23,12);
		
	}
	public static void add(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}
	public static void sub(int a, int b) {
		int result = a - b;
		System.out.println(result);
	}
	public static void mul(int a, int b) {
		int result = a * b;
		System.out.println(result);
	}
	public static void div(int a, int b) {
		int result = a / b;
		System.out.println(result);
	}
	
}
