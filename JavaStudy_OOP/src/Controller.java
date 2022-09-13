import java.util.Random;
import java.util.Scanner;

public class Controller {

	private CD cd;

	public Controller(CD cd) {
		this.cd = cd;
	}

	public void play() {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < cd.getLife();) {
			cd.makeNum();

			System.out.print(cd.getQues());

			int answer = scan.nextInt();

			if (cd.isOK(answer)) {
				System.out.println("참 잘했어용~");
				break;
			} else {
				System.out.println(cd.getFailMsg(i++));

			}
		}
	}
}
