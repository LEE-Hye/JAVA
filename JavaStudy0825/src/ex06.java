import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("¡Ú±Ý¾×À» ÀÔ·ÂÇÏ¼¼¿ä¡Ù");
		int money = sc.nextInt();
		System.out.println("");
		System.out.println("¡Ú¸Þ´º¸¦ °í¸£¼¼¿ä¡Ù");
		System.out.print("1. ÄÝ¶ó(800¿ø) 2. »ý¼ö(500¿ø) 3. ºñÅ¸¹Î¿öÅÍ(1500¿ø) >> ");
		int num = sc.nextInt();
		System.out.println("");

		// ¹æ¹ý 1. (³»°¡ Ç¬ °Í)
//		switch (num) {
//		case 1:
//			if (money < 800) {
//				System.out.println("µ·ÀÌ ºÎÁ·ÇØ¿ä");
//				System.out.println("ÀÜµ· : " + money);
//			} else {
//				System.out.println("ÀÜµ· : " + (money - 800));
//			}
//			break;
//		case 2:
//			if (money < 500) {
//				System.out.println("µ·ÀÌ ºÎÁ·ÇØ¿ä");
//				System.out.println("ÀÜµ· : " + money);
//			} else {
//				System.out.println("ÀÜµ· : " + (money - 500));
//			}
//			break;
//		case 3:
//			if (money < 1500) {
//				System.out.println("µ·ÀÌ ºÎÁ·ÇØ¿ä");
//				System.out.println("ÀÜµ· : " + money);
//			} else {
//				System.out.println("ÀÜµ· : " + (money - 1500));
//			}
//			break;
//		}
		
		// ¹æ¹ý2. ¼±»ý´ÔÀÌ Ç¬ °Í
		int productMoeny = 0;
		
		if(num==1) {
			productMoeny = 800;
		}
		if(num==2) {
			productMoeny = 500;
		}
		if(num==3) {
			productMoeny = 1500;
		}
		
		if(money>=productMoeny) {
			int jandon = money-productMoeny;
			int cheon = jandon / 1000;
			int ohback = jandon % 1000 /500;
			int back = jandon % 500/100;
			System.out.println("¡ÚÀÜµ·¡Ù");
			System.out.println(jandon);
			System.out.println("");
			System.out.println("¡Ú°Å½º¸§µ·¡Ù");
			System.out.println("Ãµ¿ø : "+ cheon + "°³, ¿À¹é¿ø : " + ohback + "°³, ¹é¿ø : " + back + "°³");
			
		}
		else {
			System.out.println("±Ý¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
		}

	}

}
