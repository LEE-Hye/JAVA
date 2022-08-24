
public class ex01 {

	public static void main(String[] args) {
		
		// 귤 3,729개를 한 사람당 52개씩 박스에 담아서 나눠줄라 하는데
		// 박스 수를 구해보세요
		
		int orange = 3729;
		int number = 52;
		System.out.println("박스 수 : " + orange/number);
		System.out.println("남은 귤 수 : " + orange % number);
		System.out.println("남은 귤까지 넣는 박스 수 : " + (orange/number + 1));

	}

}
