
public class Continue {

	public static void main(String[] args) {
		 
		System.out.println("3 ���� ������ ���");
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("¦�� ���");
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
