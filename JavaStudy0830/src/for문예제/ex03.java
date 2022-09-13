package for문예제;

public class ex03 {

	public static void main(String[] args) {

//		for (int i = 2; i < 10; i++) {
//			System.out.println("🖤 " + i + "단 🖤");
//			for (int n = 1; n < 10; n++) {
//				System.out.print(i + " * " + n + "=" + (n * i));
//			}
//			System.out.println();
//		}

		
		for (int i = 2; i < 10; i++) {
			System.out.print( i + "단 : ");
			for (int n = 1; n < 10; n++) {
				System.out.print(i + " * " + n + "=" + (n * i) + "\t   ");
			}
			System.out.println();
		}
		
		for (int n = 1; n < 10; n++) {
			for (int i = 2; i < 10; i++) {
				System.out.print(i + " * " + n + "=" + (n * i) + "\t    ");
			}
			System.out.println();
		}

	}

}
