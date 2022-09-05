
public class PiggyBankMain {

	public static void main(String[] args) {

		// 저금통 설계도 불러오기
		PiggyBank pb = new PiggyBank();
		
		// 저금통에 1500원, 700원을 입금한 후 출력하세요
		pb.deposit(1500);
		pb.deposit(700);
		
		// 현재 잔액 출력
		pb.showMoney();
		
		// 저금통에서 500원 출금
		pb.withdraw(500);
		
		// 현재 잔액 출력
		pb.showMoney();

	}

}
