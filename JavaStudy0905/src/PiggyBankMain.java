
public class PiggyBankMain {

	public static void main(String[] args) {

		// ������ ���赵 �ҷ�����
		PiggyBank pb = new PiggyBank();
		
		// �����뿡 1500��, 700���� �Ա��� �� ����ϼ���
		pb.deposit(1500);
		pb.deposit(700);
		
		// ���� �ܾ� ���
		pb.showMoney();
		
		// �����뿡�� 500�� ���
		pb.withdraw(500);
		
		// ���� �ܾ� ���
		pb.showMoney();

	}

}
