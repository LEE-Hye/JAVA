
public class ex05 {

	public static void main(String[] args) {
		int sum = 0; // ÇÕ
	      // 1~100
	      for (int i = 1; i <= 100; i++) {
	         if (i % 2 == 0) {// Â¦¼ö
	            System.out.print(-i + " ");
	            sum += -i;
	         } else {// È¦¼ö
	            System.out.print(i + "t");
	            sum += i;
	         }
	      }
	      System.out.println("\n°á°ú >> " + sum);

	}

}
