import java.util.Scanner;

public class ex06_��Ģ����2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 50;
		int num2 = 15;
//		String op = "-";
		System.out.print("50�� 15�� � ��Ģ�������� ����ϰڽ��ϱ� : ");
		String op = sc.next();
	
		System.out.println(cal(num1,num2, op));
	}
	
	public static String cal(int num1,int num2, String op) {
		
		int result = 0;
		
		// if ���ǹ��� �Ἥ �Է��� ��Ģ���꿡 ���� �� �����ϱ�!
//		if(op.equals("-")) {
//			result = num1 - num2;
//		}else if(op.equals("+")) {
//			result = num1 + num2;
//		}else if(op.equals("*")) {
//			result = num1 * num2;
//		}else if(op.equals("/")) {
//			result = num1 / num2;
//		}else if(op.equals("%")) {
//			result = num1 % num2;
//		}
		
		// switch ���ǹ��� �Ἥ �Է��� ��Ģ���꿡 ���� �� �����ϱ�!
		switch(op) {
		
		case "-" : 
			result = num1 - num2;
			break;
		case "+" : 
			result = num1 + num2;
			break;
		case "*" : 
			result = num1 * num2;
			break;
		case "/" : 
			result = num1 / num2;
			break;
		case "%" : 
			result = num1 % num2;
		}
		
		return "������� " + result + "�Դϴ�."; 
		
	}

}
