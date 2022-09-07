
public class Mp3 {
	
	private String singer;
	private String title;
	private int playTime;
	private String path; // 음악경로
	
	// getter 메소드
	public String getSinger() {
		return singer;
	}
	public String getTitle() {
		return title;
	}
	public int getPlayTime() {
		return playTime;
	}
	public String getPath() {
		return path;
	}
	
	// 생성자
	public Mp3(String singer, String title, int playTime, String path) {
		this.singer = singer;
		this.title = title;
		this.playTime = playTime;
		this.path = path;
	}
}
