import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1. ���ҽ�(Model), �˰���(Controller), ���(View)
		// 2. ù�ٺ��� �Ϻ��ϰ� �� �ᵵ �ȴ�. ū �׸� ���鼭 ��ġ�� ��!
		// 3. �߰��߰� �׽�Ʈ ��� ����

		MinusCD cd1 = new MinusCD(3, 89, new String[] { "������", "�� ���غ�", "...?" });
		Controller game = new Controller(cd1);
		game.play();
		
		PlusCD cd2 = new PlusCD(3,20, new String[] { "������", "�� ���غ�", "...?" });
		Controller game2 = new Controller(cd2);
		game2.play();
	}

}
