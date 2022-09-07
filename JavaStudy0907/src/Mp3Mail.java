import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Mp3Mail {

	public static void main(String[] args) {
		
		MP3Player mp3 = new MP3Player();
		Scanner sc = new Scanner(System.in);
		
		// 가수(singer)
		// 제목(title)
		// 재생시간(playTime)
//		Mp3 mp3 = new Mp3();

		ArrayList<Mp3> list = new ArrayList<Mp3>();
		
		list.add(new Mp3("태연", "사계", 100, "C:\\Users\\smhrd\\git\\JAVA\\JavaStudy0907\\music\\사계 - 태연.mp3"));
		list.add(new Mp3("Rain", "깡", 200, "C:\\Users\\smhrd\\git\\JAVA\\JavaStudy0907\\music\\깡 - Rain.mp3"));
		list.add(new Mp3("IVE", "LOVE DIVE", 300, "C:\\Users\\smhrd\\git\\JAVA\\JavaStudy0907\\music\\LOVE DIVE - IVE.mp3"));
		
		// 틀 만들기
		
		// 1번을 누르면 재생
		// 2번을 누르면 정지
		// 3번을 누르면 이전곡
		// 4번을 누르면 다음곡
		// 5번을 누르면 종료 -> "MP3 Player를 종료합니다."

		int song_num = 0;
		while(true) {
			
			System.out.print("[1] 재생 [2] 정지 [3] 이전곡 [4] 다음곡 [5] 종료 >> ");
			int choice = sc.nextInt();
			
			 
			
			// 1번 재생을 눌렀을 때
			if(choice == 1) {
				// 재생
				// '가수' : '제목'('재생시간' 초)
				System.out.println("=====================재생====================");

					String singer = list.get(song_num).getSinger();
					String title = list.get(song_num).getTitle();
					int playTime = list.get(song_num).getPlayTime();
					System.out.printf("%s : %s(%d 초)", singer, title, playTime);
					
					mp3.play(list.get(song_num).getPath());
				
				System.out.println();
				System.out.println();
			}
			// 2번 정지를 눌렀을 때
			else if(choice == 2) {
				System.out.println("=====================정지=====================");
				mp3.stop();
				System.out.println("노래를 중지합니다.");
				System.out.println();
			}
			// 3번 이전곡을 눌렀을 때
			else if(choice == 3) {
				System.out.println("====================이전곡=====================");
				mp3.stop(); // 재생되고 있는 곡이 있다면 일단 멈춰라

				if(song_num > 0) {
					song_num--;
					String singer = list.get(song_num).getSinger();
					String title = list.get(song_num).getTitle();
					int playTime = list.get(song_num).getPlayTime();
					System.out.printf("%s : %s(%d 초)", singer, title, playTime);
					
					mp3.play(list.get(song_num).getPath());
				}else {
					System.out.println("이전곡이 없습니다.");
				}
				
				System.out.println();
				System.out.println();
			}
			// 4번 다음곡을 눌렀을 때
			else if(choice == 4) {
				System.out.println("====================다음곡=====================");
				mp3.stop();
				
				if(song_num<list.size()-1) {
					song_num++;
					String singer = list.get(song_num).getSinger();
					String title = list.get(song_num).getTitle();
					int playTime = list.get(song_num).getPlayTime();
					System.out.printf("%s : %s(%d 초)", singer, title, playTime);
					
					mp3.play(list.get(song_num).getPath());
				}else {
					System.out.println("다음곡이 없습니다.");
				}
				System.out.println();
				System.out.println();
			}
			// 5번 종료를 눌렀을 때
			else if(choice == 5) {
				System.out.println("=====================종료======================");
				System.out.println("MP3 Player를 종료합니다.");
				break;
			}
			// 1~5번 외 숫자를 입력했을 때
			else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
			}
		}
	}

}
