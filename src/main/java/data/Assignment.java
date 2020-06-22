package data;

public class Assignment implements Message {
	private String message;

	private Calendar.Date createDate;

	private Calendar.Date assigmentDate;

	private String link;
	@Override
	public String getMessage() {
		return null;
	}
	public void setLink(String  link){
		this.link = link;
	}
	@Override
	public Calendar.Date getDate() {
		return null;
	}

	public Calendar.Date getAssigmentDate() {
		return assigmentDate;
	}

	@Override
	public String toString() {
		return "Assignment{" +
				"message='" + message + '\'' +
				", createDate=" + createDate +
				", assignmentDate=" + assigmentDate +
				", link='" + link + '\'' +
				'}';
	}

}
