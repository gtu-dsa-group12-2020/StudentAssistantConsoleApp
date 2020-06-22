package data;
public class Notification implements Message{
    private String note;
    private Calendar.Date date;

    public Notification(String note, Calendar.Date date) {
        this.note = note;
    }


    @Override
    public String getMessage() {
        return note;
    }

    @Override
    public Calendar.Date getDate() {
        return date;
    }
}