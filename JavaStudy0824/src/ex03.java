import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		// JAVA, Web, Android 점수를 사용자로부터 키보드로 입력 받아 합계와 평균을 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA 점수를 입력하세요 : ");
		int java = sc.nextInt();
		
		System.out.print("Web 점수를 입력하세요 : ");
		int web = sc.nextInt();
		
		System.out.print("Android 점수를 입력하세요 : ");
		int android = sc.nextInt();
		
		int hab = java + web + android;
		int avg = hab/3;
		
		System.out.println("=====================");
		System.out.println("점수의 합계는 " + hab + "점 입니다.");
		System.out.println("점수의 평균은 " + avg + "점 입니다.");

		sc.close();
	}

}
