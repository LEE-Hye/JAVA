package buildup;

import java.util.Scanner;

public class ex03_ScannerClose {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�޷� �Է� : ");
			int input = sc.nextInt();
			if(input == -1) {
				break;
			}else {
				System.out.println(input*13804 + "�� �Դϴ�.");				
			}
			
		}
		sc.close();
	}

}
