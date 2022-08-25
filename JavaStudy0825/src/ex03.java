import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		int grade = sc.nextInt();
		
		if(grade >= 90) {
			System.out.println("A학점입니다.");
		}
		else if(grade >= 80) {
			System.out.println("B학점입니다.");
		}
		else if(grade >= 70) {
			System.out.println("C학점입니다.");
		}
		else {
			System.out.println("휴학 추천합니다 ♪(^∇^*)");
		}
	
	}

}
