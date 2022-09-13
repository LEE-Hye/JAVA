package 덧셈게임;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random ran = new Random();

		String[] fails = { "~\\(≧▽≦)/~", ".·´¯`(>▂<)´¯`·. ", "┗|｀O′|┛" };

		int i = 0;
		int j = 20;
		int k = 100;

		while (true) {

			for (i = 0; i < fails.length; i++) {
				int ran1 = ran.nextInt(j) + 1;
				int ran2 = ran.nextInt(k) + 1;
				System.out.printf("[%d번 문제] \n", i + 1);
				System.out.print(ran1 + "+" + ran2 + " = ");

				int num = sc.nextInt();

				if ((ran1 + ran2) == num) {
					System.out.println(i + 1 + "번만에 성공~");
					System.out.println("(✿ﾟ▽ﾟ)ノ");
					break;
				} else if (i + 1 == fails.length) {
					System.out.println("Game Over");
				} else {
					System.out.println(fails[i]);
					System.out.println();
				}

			}
			break;
		}

	}

}
