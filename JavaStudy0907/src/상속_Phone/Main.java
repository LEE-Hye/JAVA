package ���_Phone;

public class Main {

	public static void main(String[] args) {
		
		// ����!
		
		// ������ ��ü �����ϱ�!
		// �ּҰ� ���� �� �ּҷ� �޸𸮿� ���� �Ϸ��� ���۷��� ������ ���
		// ������ Ÿ�Ե� �޸��� Ÿ���̶� �����ϰ� FeaturePhone = FeaturePhone()
		FeaturePhone p1 = new FeaturePhone();
		
		// 1. ����� ������ ���� Ŭ������ �Ӽ��� ����� ��� ��������!		
		p1.call();
		p1.send();
		p1.sms();

		
		
		// ����Ʈ�� ��ü �����ϱ�!
		SmartPhone p2 = new SmartPhone();
		
		p2.call();
		p2.send();
		p2.sms();
		p2.wifi();
		
		 
		// 2. ��� ���迡�� ���� Ŭ���� ��ü�� ���� Ŭ���� Ÿ������ ����ȯ�� �����ϴ�.
		// => ��ĳ����
		new FeaturePhone();
		
		
		
	}

}
