package Ch02;

public class C04TestDto {
	private String username;
	private String password;
	private String bgColor;

	// 디폴트생성자
	public C04TestDto() {
		super();
	}

	// 모든인자생성자
	public C04TestDto(String username, String password, String bgColor) {
		super();
		this.username = username;
		this.password = password;
		this.bgColor = bgColor;
	}

	// getter and setter(필수)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	// toString 재정의
	@Override
	public String toString() {
		return "C04TestDto [username=" + username + ", password=" + password + ", bgColor=" + bgColor + "]";
	}
}
