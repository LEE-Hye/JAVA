
public class ex02 {

	public static void main(String[] args) {
		
		 // for 문을 사용하여 21에서 57까지 출력하시오
	      for(int i=21;i<58;i++) {
	         System.out.print(i+" ");
	      }
	      System.out.println();
	      
	      // for 문을 사용하여 96에서 53까지 출력하시오.
	      for(int i=96;i>52;i--) {
	         System.out.print(i+" ");
	      }
	      System.out.println();
	      
	      //for문을 사용하여 21에서 57까지의 수 중 홀수만 출력하시오
	      //첫번째 방식
	      for(int i=21;i<58;i++) {
	         if(i%2==1) {
	            System.out.print(i+" ");
	         }
	         
	      }
	      System.out.println();
	      //두번째 방식
	      for(int i=21;i<58;i+=2) {
	         System.out.print(i+" ");
	      }



	}

}
