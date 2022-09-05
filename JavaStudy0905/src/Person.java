
public class Person {
	// ���� ���ϴ� ����� ���� �� �ִ� ���赵!
	
	// Ŭ������ ���� :  �ʵ�, �޼ҵ�
	// ����� Ư¡ : ����, �̸�, ����, Ű . . .
	String name; 
	int age;
	String gender;
	int height;
	
	// ������
	// ����Ű : ��ų�� -> source -> Generator Constructor using Fields
	// 		   : �츮�� �����ص� �ʵ带 �̿��ؼ� ������ �����
	// ������ Ư¡
	// 1. ���� Ÿ���� ����(void ��ü�� ����)
	// 2. ������ �޼ҵ� �̸��� Ŭ���� �̸��� ����
	// 3. �����ڴ� new��� Ű���带 ���ؼ��� ȣ���� �� �ִ�.
	public Person(String name, int age, String gender, int height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
	
	// 4. ������ �޼ҵ�� �����ε�(�ߺ�����)
	// �⺻ ������ �Ǵ� default �����ڶ�� ��
	// ��ü ������ �����ڰ� ���� ��� compile�� �� �⺻ �����ڰ� �ڵ����� ����
	// But, �����ڰ� �ϳ� �̻��� �����ϸ� �⺻ �����ڴ� �ڵ����� x
	public Person() {
		
	}


	// ����� �ൿ : ���ϱ�, �Ա�, �ȱ�, �ڱ� . . .
	public void talk() {
		System.out.println("�������� ���ϱ�~");
	}
	
	public void eat() {
		System.out.println("�ȳ� �Ա�~");
	}
	
	public void walk() {
		System.out.println("�ѹ��ѹ� �ȱ�. . ����");
	}
	
	public void sleep() {
		System.out.println("���� �ڱ�zzzZZ");
	}
	
}

