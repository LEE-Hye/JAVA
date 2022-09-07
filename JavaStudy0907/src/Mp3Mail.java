import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Mp3Mail {

	public static void main(String[] args) {
		
		MP3Player mp3 = new MP3Player();
		Scanner sc = new Scanner(System.in);
		
		// ����(singer)
		// ����(title)
		// ����ð�(playTime)
//		Mp3 mp3 = new Mp3();

		ArrayList<Mp3> list = new ArrayList<Mp3>();
		
		list.add(new Mp3("�¿�", "���", 100, "C:\\Users\\smhrd\\git\\JAVA\\JavaStudy0907\\music\\��� - �¿�.mp3"));
		list.add(new Mp3("Rain", "��", 200, "C:\\Users\\smhrd\\git\\JAVA\\JavaStudy0907\\music\\�� - Rain.mp3"));
		list.add(new Mp3("IVE", "LOVE DIVE", 300, "C:\\Users\\smhrd\\git\\JAVA\\JavaStudy0907\\music\\LOVE DIVE - IVE.mp3"));
		
		// Ʋ �����
		
		// 1���� ������ ���
		// 2���� ������ ����
		// 3���� ������ ������
		// 4���� ������ ������
		// 5���� ������ ���� -> "MP3 Player�� �����մϴ�."

		int song_num = 0;
		while(true) {
			
			System.out.print("[1] ��� [2] ���� [3] ������ [4] ������ [5] ���� >> ");
			int choice = sc.nextInt();
			
			 
			
			// 1�� ����� ������ ��
			if(choice == 1) {
				// ���
				// '����' : '����'('����ð�' ��)
				System.out.println("=====================���====================");

					String singer = list.get(song_num).getSinger();
					String title = list.get(song_num).getTitle();
					int playTime = list.get(song_num).getPlayTime();
					System.out.printf("%s : %s(%d ��)", singer, title, playTime);
					
					mp3.play(list.get(song_num).getPath());
				
				System.out.println();
				System.out.println();
			}
			// 2�� ������ ������ ��
			else if(choice == 2) {
				System.out.println("=====================����=====================");
				mp3.stop();
				System.out.println("�뷡�� �����մϴ�.");
				System.out.println();
			}
			// 3�� �������� ������ ��
			else if(choice == 3) {
				System.out.println("====================������=====================");
				mp3.stop(); // ����ǰ� �ִ� ���� �ִٸ� �ϴ� �����

				if(song_num > 0) {
					song_num--;
					String singer = list.get(song_num).getSinger();
					String title = list.get(song_num).getTitle();
					int playTime = list.get(song_num).getPlayTime();
					System.out.printf("%s : %s(%d ��)", singer, title, playTime);
					
					mp3.play(list.get(song_num).getPath());
				}else {
					System.out.println("�������� �����ϴ�.");
				}
				
				System.out.println();
				System.out.println();
			}
			// 4�� �������� ������ ��
			else if(choice == 4) {
				System.out.println("====================������=====================");
				mp3.stop();
				
				if(song_num<list.size()-1) {
					song_num++;
					String singer = list.get(song_num).getSinger();
					String title = list.get(song_num).getTitle();
					int playTime = list.get(song_num).getPlayTime();
					System.out.printf("%s : %s(%d ��)", singer, title, playTime);
					
					mp3.play(list.get(song_num).getPath());
				}else {
					System.out.println("�������� �����ϴ�.");
				}
				System.out.println();
				System.out.println();
			}
			// 5�� ���Ḧ ������ ��
			else if(choice == 5) {
				System.out.println("=====================����======================");
				System.out.println("MP3 Player�� �����մϴ�.");
				break;
			}
			// 1~5�� �� ���ڸ� �Է����� ��
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println();
			}
		}
	}

}
