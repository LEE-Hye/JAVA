import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1. 리소스(Model), 알고리즘(Controller), 출력(View)
		// 2. 첫줄부터 완벽하게 안 써도 된다. 큰 그림 보면서 고치면 돼!
		// 3. 중간중간 테스트 계속 하자

		MinusCD cd1 = new MinusCD(3, 89, new String[] { "잘하자", "더 잘해봐", "...?" });
		Controller game = new Controller(cd1);
		game.play();
		
		PlusCD cd2 = new PlusCD(3,20, new String[] { "잘하자", "더 잘해봐", "...?" });
		Controller game2 = new Controller(cd2);
		game2.play();
	}

}
