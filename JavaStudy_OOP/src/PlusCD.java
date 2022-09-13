
public class PlusCD extends CD {

	public PlusCD(int life, int max, String[] failMsg) {
		super(life, max, failMsg);
	}

	@Override
	public void makeNum() {
		num1 = rd.nextInt(max) + 10;
		num2 = rd.nextInt(max) + 10;
	}

	@Override
	public String getQues() {
		return num1 + " + " + num2 + " = ";
	}

	@Override
	public boolean isOK(int answer) {
		
		return answer == num1 + num2;
	}

}
