import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력해주세요 : ");
		int mon = sc.nextInt();
		
		switch(mon) {
		case 12 :
		case 1 :
		case 2 :
			System.out.println(mon + "월은 겨울입니다!");
			break;
		case 3,4,5 :
			System.out.println(mon + "월은 봄입니다!");
			break;
		case 6,7,8 :
			System.out.println(mon + "월은 여름입니다!");
			break;
		case 9,10,11 :
			System.out.println(mon + "월은 가을입니다!");
			break;
		}
		
		// ctrl + alt +  방향키 : 원하는 방향에 복사된다
	}

}
