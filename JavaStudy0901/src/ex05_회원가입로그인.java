import java.util.Scanner;

public class ex05_회원가입로그인 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	      // 프로그램을 실행하면
	      String[] id = new String[3];
	      String[] pw = new String[3];

	      id[0] = "bin";
	      pw[0] = "1234";

	      id[1] = "ai";
	      pw[1] = "1209";

	      // [1]회원가입 [2]로그인 [3]종료 >>
	      // menu : 입력받을 변수 이름
	      // 3을 입력하면 "프로그램 종료!"를 띄우고 while문 탈출
	      while (true) {

	         System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");
	         int menu = sc.nextInt();

	         if (menu == 1) {
	            System.out.println("====회원가입====");
	            // "회원가입할 ID : "
	            // 입력받은 값을 id[2]에 저장
	            System.out.print("회원가입할 ID : ");
	            id[2] = sc.next();
	            // id[2] = db_id;

	            // "회원가입할 PW : "
	            // 입력받은 값을 pw[2]에 저장
	            System.out.print("회원가입할 PW : ");
	            pw[2] = sc.next();

	            // "회원가입 완료"
	            System.out.println("회원가입 완료");

	         } else if (menu == 2) {
	            System.out.println("====로그인====");

	            // "ID를 입력 : "
	            // 입력받은 ID를 input_id 에 저장
	            System.out.print("ID를 입력 : ");
	            String input_id = sc.next();

	            // "PW를 입력 : "
	            // 입력받은 PW를 input_pw 에 저장
	            System.out.print("PW를 입력 : ");
	            String input_pw = sc.next();

	            // for문을 통해 배열을 돌면서 input_id 와 input_pw 가 배열의 값과 일치한다면
	            // "로그인 성공" 출력
	            // 아니라면
	            // "로그인 실패" 출력
	            boolean check = true;
	            
	            for (int i = 0; i < id.length; i++) {
	               
	               if (input_id.equals(id[i]) && input_pw.equals(pw[i])) {            
	                  System.out.println("로그인 성공!");
	                  check = false;
	                  break;
	               }               
	            }
	            if(check == true) {
	               System.out.println("로그인 실패");
	            }

	         } else if (menu == 3) {
	            System.out.println("프로그램 종료!");
	            break;
	         } else {
	            System.out.println("잘못입력하셨습니다.");
	         }

	      }


	}

}
