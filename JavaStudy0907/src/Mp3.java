
public class Mp3 {
	
	private String singer;
	private String title;
	private int playTime;
	private String path; // ���ǰ��
	
	// getter �޼ҵ�
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
	
	// ������
	public Mp3(String singer, String title, int playTime, String path) {
		this.singer = singer;
		this.title = title;
		this.playTime = playTime;
		this.path = path;
	}
}
