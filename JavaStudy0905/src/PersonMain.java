
public class PersonMain {

	public static void main(String[] args) {

		// Person ���赵�κ��� ��ü�� ��������� ��
		
		// ���赵 �ҷ�����(p1, p2��� ��ü �����)
		// (�Ұ�ȣ �پ� ������ Person()�� �޼ҵ��̴�.)
		Person p1 = new Person();
		Person p2 = new Person();
		
		// p1�� p2�� �̸�, ����, ����, Ű�� ����
		p1.name = "ȫ�浿";
		p1.age = 24;
		p1.gender =  "����";
		p1.height = 170;
		
		p2.name = "���̹�";
		p2.age = 21;
		p2.gender =  "����";
		p2.height = 193;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.gender);
		System.out.println(p1.height);

		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.gender);
		System.out.println(p2.height);
		
		Person p3 = new Person("�嵿��", 21, "����", 188);
		
		p1.eat();
		p1.talk();
		p1.sleep();
		p1.walk();
	}

}