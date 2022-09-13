import java.util.Random;

public class MinusCD extends CD{
	
	public MinusCD(int life, int max, String[] failMsg) {
		super(life, max, failMsg);

	}

	public void makeNum() {
		num1 = rd.nextInt(max) + 10;
		num2 = rd.nextInt(num1);
	}
	
	public String getQues() {
		return num1 + " - " + num2 + " = ";
	}

	public boolean isOK(int answer) {
		return answer == num1 - num2;
	}

}
