import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		int grade = sc.nextInt();
		
		// 다중 if문으로 만들기!
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
		
		// switch문으로 바꾸기!
		switch(grade/10) {
		case 10:
			System.out.println("A+ 학점 입니다.");
			break;
		case 9:
			System.out.println("A학점 입니다.");
			break;
		case 8:
			System.out.println("B학점 입니다.");
			break;
		case 7:
			System.out.println("C학점 입니다.");
			break;
		default:
			System.out.println("휴학 추천할게용");
		}
	}
}
