package OOP;

public class StudentMain {

	public static void main(String[] args) {
		
		// ��ü : ���۷��� ����!
		Student st1 = new Student();
		st1.name = "ȫ�浿";
		st1.number = "20150675";
		st1.age = 22;
		st1.scoreJava = 50;
		st1.scoreWeb = 89;
		st1.scoreAndroid = 77;
		
		Student st2 = new Student();
		st2.name = "�迵��";
		st2.number = "20090541";
		st2.age = 29;
		st2.scoreJava = 90;
		st2.scoreWeb = 25;
		st2.scoreAndroid = 30;
		
		// st1 �� st2�� ��� ������ ������ּ���!
		System.out.println("st1 ��� : " + st1.avg());		
		System.out.println("st2 ��� : " + st2.avg());		
//		int st1_score = (st1.scoreAndroid+st1.scoreJava+st1.scoreWeb)/3;
//		System.out.println("st1�� ������� : " + st1_score);
//		int st2_score = (st2.scoreAndroid+st2.scoreJava+st2.scoreWeb)/3;
//		System.out.println("st2�� ������� : " + st2_score);
		
		st1.show();
		System.out.println("=============================");
		st2.show();
	}

}
