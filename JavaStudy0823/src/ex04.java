import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		// 사용자로부터 데이터를 입력받을 수 있는 기능
		Scanner sc = new Scanner(System.in);
		
		// nextInt --> 사용자로부터 입력받은 값을 정수로 인식해주세요
		System.out.print("숫자를 입력해주세요 : ");
		// System.out.println() -> 출력 후 다음 줄로 이동
		// System.out.print() -> 출력 후 다음 줄로 이동 안 함
		int num = sc.nextInt(); // 입력 후 다음 줄로 이동
		
		
		// num 값의 일의 자리를 1로 바꿈
		System.out.println("'일의 자리'를 '1'로 바꾼 결과확인 : " + num/10 + "1");
		
		// num1 값의 일의 자리를 0으로 바꿈
		// num에서 일의 자리를 뺀 숫자를 출력시켜주세요!
		// --> num에서 10으로 나눈 나머지 만큼 빼서 출력시켜 주세요!
		System.out.println("선생님의 '일의 자리'가'0'인 결과 확인 : " + (num - num%10));
		System.out.println("내 '일의 자리'가 '0'인 결과확인 : " + num/10 + "0");
		// 573 -> 570
		// 465 -> 460
		// 373 -> 370
		
		// num2 값의 일의 자리만 출력 되게
		System.out.println("'일의 자리만' 출력되는 결과확인 : " + num%10);
	}

}
