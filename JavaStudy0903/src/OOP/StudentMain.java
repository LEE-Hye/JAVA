package OOP;

public class StudentMain {

	public static void main(String[] args) {
		
		// °´Ã¼ : ·¹ÆÛ·±½º º¯¼ö!
		Student st1 = new Student();
		st1.name = "È«±æµ¿";
		st1.number = "20150675";
		st1.age = 22;
		st1.scoreJava = 50;
		st1.scoreWeb = 89;
		st1.scoreAndroid = 77;
		
		Student st2 = new Student();
		st2.name = "±è¿µÈñ";
		st2.number = "20090541";
		st2.age = 29;
		st2.scoreJava = 90;
		st2.scoreWeb = 25;
		st2.scoreAndroid = 30;
		
		// st1 °ú st2ÀÇ Æò±Õ Á¡¼ö¸¦ Ãâ·ÂÇØÁÖ¼¼¿ä!
		System.out.println("st1 Æò±Õ : " + st1.avg());		
		System.out.println("st2 Æò±Õ : " + st2.avg());		
//		int st1_score = (st1.scoreAndroid+st1.scoreJava+st1.scoreWeb)/3;
//		System.out.println("st1ÀÇ Æò±ÕÁ¡¼ö : " + st1_score);
//		int st2_score = (st2.scoreAndroid+st2.scoreJava+st2.scoreWeb)/3;
//		System.out.println("st2ÀÇ Æò±ÕÁ¡¼ö : " + st2_score);
		
		st1.show();
		System.out.println("=============================");
		st2.show();
	}

}
