package for문예제;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 >> ");
		int num = sc.nextInt();
		for(int n=2;n<=num;n++) {
			System.out.print(n+"의 약수 >> ");
			for(int i = 1; i<=n;i++) {
				if(n%i==0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
