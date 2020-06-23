package data;

import java.util.Date;


public interface Message extends Comparable<Date>{
	
	String getMessage();
	Date getDate();
}
