package data;

import java.util.Date;

public class Assignment implements Message, Comparable<Date> {
	private String message;

	private Date createDate;

	private Date assigmentDate;

	private String link;

	@Override
	public String getMessage() {
		return null;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public Date getDate() {
		return null;
	}

	public Date getAssigmentDate() {
		return assigmentDate;
	}

	@Override
	public String toString() {
		return "Assignment\n" +
				"message='" + message + '\n' +
				"link='" + link + '\n' +
				"createDate=" + createDate + '\n' +
				"assignmentDate=" + assigmentDate + '\n';
	}


	@Override
	public int compareTo(Date date) {
		return this.assigmentDate.compareTo(date);
	}
}
