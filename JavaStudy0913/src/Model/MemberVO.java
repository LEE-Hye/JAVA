package Model;

public class MemberVO {
	// Model : ���α׷��� Logic / ������ ���

	// MemberVO
	// - DB ���̺� �����ϴ� �� �÷����� �������� �����͸� ��üȭ�� Ŭ����
	// - DB ���̺� '�÷���'�� VO Ŭ������ ��� ������ �˴ϴ�.
	// - �����͸� �����ϴ� ���Ҹ� �ϴ� Ŭ����

	// 4���� ������ ����
	// ���������ڴ� private
	// 1. id(String) 2. pw(String) 3. name(String) 4. nick(String)
	private String id;
	private String pw;
	private String name;
	private String nick;

	// 4���� ������ �� �޴� ������ �����
	public MemberVO(String id, String pw, String name, String nick) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nick = nick;
		// ���������� �Ű������� ���� �༮�̾� ��� �������ذ��̴�.(this)
	}

	// Getter / Setter ��������

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	// Getter : ��ȸ
	// Setter : ����

}
