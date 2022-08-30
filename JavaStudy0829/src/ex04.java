
public class ex04 {

	public static void main(String[] args) {
		 // 1~100 중 3의 배수의 합을 출력
	      int result = 0;
	      for (int i = 1; i <= 100; i++) {
	         if (i % 3 != 0) {
	            System.out.print(i + " ");
	            result += i;  // 3의 배수
	         }
	      }
	      System.out.println();
//	      System.out.println("3의 배수가 아닐때의 합 >> " + result); // 3의 배수 합 출력
	}

}
