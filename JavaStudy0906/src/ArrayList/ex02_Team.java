package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ex02_Team {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> team = new ArrayList<String>();

				for(int i = 0; i < 5; i++) {
					System.out.print("이름을 입력하세요 : ");
					team.add(i,sc.next());
				}
				
				// 출력
				System.out.print("전수팀의 팀원은 ");
				for (int i = 0; i < team.size(); i++) {
					System.out.print(team.get(i) + " ");
				}
				System.out.println("입니다.");
				System.out.println();
				
				// 팀 제명하기
				// 1. 삭제할 팀원의 이름을 입력받기
				System.out.print("삭제할 팀원의 이름을 입력해주세요 : ");
				String team_name = sc.next();
				// 2. 입력받은 이름이  team에 있다면, 해당 이름 삭제하기
				for(int i = 0; i < team.size(); i++) {
					if(team_name.equals(team.get(i))) {
						team.remove(i);
						System.out.println(team_name + "님은 제명됐습니다.");
					}
				}
				// 출력
				System.out.print("전수팀의 팀원은 ");
				for (int i = 0; i < team.size(); i++) {
					System.out.print(team.get(i) + " ");
				}
				System.out.println("입니다.");
				
				
				
	}

}
