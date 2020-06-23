package data;

import java.util.Date;


public interface Message extends Comparable<Date>{
	/**
	 * there we use calender and we need a new massage
	 * @return the  messega
	 */
	String getMessage();

	/**
	 * message have a time thats mean date
	 * @return the date
	 */
	Date getDate();
}
