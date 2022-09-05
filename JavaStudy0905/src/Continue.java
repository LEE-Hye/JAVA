
public class Continue {

	public static void main(String[] args) {
		 
		System.out.println("3 제외 나머지 출력");
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("짝수 출력");
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
