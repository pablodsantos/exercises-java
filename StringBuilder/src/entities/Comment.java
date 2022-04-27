package entities;

public class Comment {
	private String textString;
	
	public Comment() {
	}

	public Comment(String textString) {
		this.textString = textString;
	}

	public String getTextString() {
		return textString;
	}

	public void setTextString(String textString) {
		this.textString = textString;
	}
}
