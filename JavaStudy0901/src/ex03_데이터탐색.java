import java.util.Scanner;

public class ex03_데이터탐색 {

	public static void main(String[] args) {
		
		String[] team = {"신명호", "김명현", "이혜빈", "전수현","나소영"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		boolean isFind = false;
		
		for(int i = 0; i < team.length; i++) {
			if(name.equals(team[i])) {
				System.out.println(name + "님은 " + i + "번 인덱스에 있습니다.");
				isFind = true;
				break;
			}
		}
		if(isFind == false) {
			System.out.println(name + "없는 사람입니다.");
		}

		

	}

}
