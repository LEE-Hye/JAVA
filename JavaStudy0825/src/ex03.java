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
		
		switch(grade) {
		case 100,99,98,97,96,95,94,93,92,91,90:
			System.out.println("A학점 입니다.");
			break;
		case 89,88,87,86,85,84,83,82,81,80:
			System.out.println("B학점 입니다.");
			break;
		case 79,78,77,76,75,74,73,72,71,70:
			System.out.println("C학점 입니다.");
			break;
		default:
			System.out.println("휴학 추천할게용");
		}
	}
}
