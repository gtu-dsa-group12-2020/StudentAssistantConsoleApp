package data;

import java.util.Date;

public class Notification implements Message,Comparable<Date>{
    private String note;
    private Date date;

    public Notification(String note, Date date) {
        this.note = note;
    }


    @Override
    public String getMessage() {
        return note;
    }

    @Override
    public Date getDate() {
        return date;
    }



    @Override
    public int compareTo(Date date) {
        return this.date.compareTo(date);
    }
}