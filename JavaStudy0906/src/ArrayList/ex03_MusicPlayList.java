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
			System.out.print("[1] �뷡 �߰� [2] �뷡 ��ȸ [3] �뷡 ���� [4] ���� >> " );
			int num = sc.nextInt();
			if(num == 1) {
				// �뷡 �߰� ���
				System.out.println("=============�뷡 �߰�============");
				System.out.print("[1] ���ϴ� ��ġ�� �߰� [2] ������ ��ġ�� �߰� >> ");
				int index = sc.nextInt();
				String song = null;
				if(index == 1) {
					System.out.print("�߰� �� ��ġ �Է� >> ");
					int loc = sc.nextInt();
					System.out.print("�߰� �� �뷡 �Է� >> ");
					song = sc.next();
					mr.add(loc, song);
					System.out.println("�߰��� �Ϸ� �Ǿ����ϴ�.\n");
				}else if(index == 2){
					System.out.print("�߰� �� �뷡 �Է� >> ");
					song = sc.next();
					mr.add(song);
					System.out.println("�߰��� �Ϸ� �Ǿ����ϴ�.\n");
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				}

			}else if(num == 2){
				// �뷡 ��ȸ ���
				System.out.println("===========���� ��� ���===========");
				for(int i = 1; i < mr.size(); i++) {
					if(mr.get(i).equals(null)) {
						System.out.println("��� ����� �����ϴ�!");
					}else{
						System.out.println(i + ". " + mr.get(i));
					}
				}
				System.out.println();
			}else if(num == 3) {
				// �뷡 ���� ���
				System.out.println("=============�뷡 ����============");
				System.out.print("[1] ���� ���� [2] ��ü ���� >> " );
				int sel = sc.nextInt();
				if(sel == 1) {
					System.out.print("���� �� �뷡 ���� >> ");
					int index = sc.nextInt();
					mr.remove(index);
					System.out.println("�뷡�� ���� �Ǿ����ϴ�.\n");
				}else if(sel == 2){
					mr.clear();
					System.out.println("��ü ����Ʈ�� �����Ǿ����ϴ�.\n");
				}else {
					System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
				}
			}else if(num == 4) {
				// ���� ���
				System.out.println("���α׷� ����!");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �������ּ���\n");
			}
		}

		 

		

		

		
	}

}
