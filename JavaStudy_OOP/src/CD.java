import java.util.Random;

public abstract class CD {

	// private 는 나만가능/protected 하위 클래스까지 가능
	protected int life;
	protected int max;
	protected String[] failMsg;
	protected Random rd;
	protected int num1;
	protected int num2;
	
	public CD(int life, int max, String[] failMsg) {
		super();
		this.life = life;
		this.max = max;
		this.failMsg = failMsg;
		
		this.rd = new Random();
		this.num1 = 0;
		this.num2 = 0;
	} 
	
	public int getLife() {
		return life;
	}

	public String getFailMsg(int i) {
		return failMsg[i];
	}
	
	public abstract void makeNum();
	public abstract String getQues();
	public abstract boolean isOK(int answer);
}
