import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================");
		System.out.print("1 ~ 5까지의 숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		System.out.println("===================");
		
		// siwtch 주의!!
		// case n 에서 한번 true 가 나온다면 밑에 있는 내용을 전부 실행시킨다.
		// --> break : break가 속해있는 제어문을 끝내주세요
		// case 값 --> 값으로는 무조건 실질적인 값이 와야한다(연산x, 변수x)
		System.out.println("-----switch-----");
		switch(num) {
		case 1:
			System.out.println("1을(를) 입력했습니다.");
			break;
		case 2:
			System.out.println("2을(를) 입력했습니다.");
			break;
		case 3:
			System.out.println("3을(를) 입력했습니다.");
			break;
		case 4:
			System.out.println("4을(를) 입력했습니다.");
			break;
		case 5:
			System.out.println("5을(를) 입력했습니다.");
			break;
		default:
			System.out.println("숫자를 잘못 입력해 주셨습니다.");
		}
		
		System.out.println("-----다중 if문-----");
		if(num == 1) {
			System.out.println("1을(를) 입력했습니다.");
		}
		else if(num == 2){
			System.out.println("2을(를) 입력했습니다.");
		}
		else if(num == 3){
			System.out.println("3을(를) 입력했습니다.");
		}
		else if(num == 4){
			System.out.println("4을(를) 입력했습니다.");
		}
		else if(num == 5){
			System.out.println("5을(를) 입력했습니다.");
		}
		else {
			System.out.println("숫자를 잘못 입력하셨어용");
		}
	}

}
