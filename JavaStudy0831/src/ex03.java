
public class ex03 {

	public static void main(String[] args) {
		
		int[] numArray = {11, 16, 13, 91, 54};

		// 배열 안에 있는 데이터들 중
		// 짝수만 출력시켜주세요!
		int cnt = 0;
		
		System.out.print("짝수만 출력시켜주기 => ");
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i]%2 == 0) {
				cnt++;
				System.out.print(numArray[i]+" ");
			}
		}
		System.out.println();
		System.out.println("짝수의 개수 : " + cnt );
	}

}
