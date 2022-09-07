
public class Address {
	
	// 주소록 
	private String name;
	private int mail;
	private String tel;

	
	// 생성자
	public Address(String name, int mail, String tel) {
		this.name = name;
		this.mail = mail;
		this.tel = tel;
	}
	
	
	public String getName() {
		return name;
	}
	public int getMail() {
		return mail;
	}
	public String getTel() {
		return tel;
	}

}
