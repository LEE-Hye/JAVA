
public class 치환 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		
		String 오른손 = "볼펜";
		String 왼손 = "마이크";
		String 책상 = "";
		
		System.out.println("치환 전");
		System.out.println("오른손에는 " + 오른손);
		System.out.println("왼손에는 " + 왼손);
		
		책상 = 오른손;
		오른손 = 왼손;
		왼손 = 책상;
		
		System.out.println("치환 후");
		System.out.println("오른손에는 " + 오른손);
		System.out.println("왼손에는 " + 왼손);
	}

}
