package buildup;

public class ex02_ArrayOut {

	public static void main(String[] args) {


		int[] array = new int[2];
		
		System.out.println(array[1]);
		
		try {
			System.out.println(array[1]);
			System.out.println(100/0);
		
//		} catch (Exception e) {
//			System.out.println("인덱스 오류");
//		}catch (Exception e) {
//			System.out.println("0으로 나눴네요~"){
//				e.printStackTrace(); catch 여러개 못적음 
		}catch (Exception e) {
			e.printStackTrace(); // 어떤 에러가 발생했는지 콘솔창에 출력
		}finally {
			System.out.println("한번은 무조건 실행하는 문법");
		}	
		System.out.println("악");
		
	}

}
