package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03_MusicPlayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> mr = new ArrayList<String>();
		mr.add(0,null);
		System.out.println("====Music Play List====\n");
		while(true) {
			System.out.print("[1] 노래 추가 [2] 노래 조회 [3] 노래 삭제 [4] 종료 >> " );
			int num = sc.nextInt();
			if(num == 1) {
				// 노래 추가 기능
				System.out.println("=============노래 추가============");
				System.out.print("[1] 원하는 위치에 추가 [2] 마지막 위치에 추가 >> ");
				int index = sc.nextInt();
				String song = null;
				if(index == 1) {
					System.out.print("추가 할 위치 입력 >> ");
					int loc = sc.nextInt();
					System.out.print("추가 할 노래 입력 >> ");
					song = sc.next();
					mr.add(loc, song);
					System.out.println("추가가 완료 되었습니다.\n");
				}else if(index == 2){
					System.out.print("추가 할 노래 입력 >> ");
					song = sc.next();
					mr.add(song);
					System.out.println("추가가 완료 되었습니다.\n");
				}else {
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				}

			}else if(num == 2){
				// 노래 조회 기능
				System.out.println("===========현재 재생 목록===========");
				for(int i = 1; i < mr.size(); i++) {
					if(mr.get(i).equals(null)) {
						System.out.println("재생 목록이 없습니다!");
					}else{
						System.out.println(i + ". " + mr.get(i));
					}
				}
				System.out.println();
			}else if(num == 3) {
				// 노래 삭제 기능
				System.out.println("=============노래 삭제============");
				System.out.print("[1] 선택 삭제 [2] 전체 삭제 >> " );
				int sel = sc.nextInt();
				if(sel == 1) {
					System.out.print("삭제 할 노래 선택 >> ");
					int index = sc.nextInt();
					mr.remove(index);
					System.out.println("노래가 삭제 되었습니다.\n");
				}else if(sel == 2){
					mr.clear();
					System.out.println("전체 리스트가 삭제되었습니다.\n");
				}else {
					System.out.println("잘못입력하셨습니다. 다시 입력하세요");
				}
			}else if(num == 4) {
				// 종료 기능
				System.out.println("프로그램 종료!");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 선택해주세요\n");
			}
		}

		 

		

		

		
	}

}
