package data;

import java.util.Date;

public class Notification implements Message,Comparable<Date>{
    private String note;
    private Date date;

    @Override
    public String toString() {
        return "Notification\n" +
                "note='" + note + '\n' +
                ", date=" + date +
                '\n';
    }

    public Notification(String note, Date date) {
        this.note = note;
        this.date = date;
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