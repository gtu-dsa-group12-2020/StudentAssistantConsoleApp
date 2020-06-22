package data;

import java.util.Date;

public class Assignment implements Message {
	private String message;

	private Date createDate;

	private Date assigmentDate;

	private String link;
	@Override
	public String getMessage() {
		return null;
	}
	public void setLink(String  link){
		this.link = link;
	}
	@Override
	public Date getDate() {
		return null;
	}

	public
	Date getAssigmentDate() {
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
