package Model;

public class MemberVO {
	// Model : 프로그램의 Logic / 데이터 담당

	// MemberVO
	// - DB 테이블에 존재하는 각 컬럼들을 기준으로 데이터를 객체화할 클래스
	// - DB 테이블에 '컬럼명'이 VO 클래스의 멤버 변수가 됩니다.
	// - 데이터를 저장하는 역할만 하는 클래스

	// 4가지 변수를 정의
	// 접근제한자는 private
	// 1. id(String) 2. pw(String) 3. name(String) 4. nick(String)
	private String id;
	private String pw;
	private String name;
	private String nick;

	// 4가지 변수를 다 받는 생성자 만들기
	public MemberVO(String id, String pw, String name, String nick) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nick = nick;
		// 전역변수와 매개변수가 같은 녀석이야 라고 지정해준것이다.(this)
	}

	// Getter / Setter 생성까지

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
	// Getter : 조회
	// Setter : 수정

}
