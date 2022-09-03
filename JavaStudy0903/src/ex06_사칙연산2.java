import java.util.Scanner;

public class ex06_사칙연산2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 50;
		int num2 = 15;
//		String op = "-";
		System.out.print("50과 15를 어떤 사칙연산으로 계산하겠습니까 : ");
		String op = sc.next();
	
		System.out.println(cal(num1,num2, op));
	}
	
	public static String cal(int num1,int num2, String op) {
		
		int result = 0;
		
		// if 조건문을 써서 입력한 사칙연산에 대한 값 리턴하기!
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
		
		// switch 조건문을 써서 입력한 사칙연산에 대한 값 리턴하기!
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
		
		return "결과값은 " + result + "입니다."; 
		
	}

}
