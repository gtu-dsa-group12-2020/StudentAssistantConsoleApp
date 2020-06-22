package data;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Calendar {
    private List<Date> dates;

    public Calendar() {
        dates = new ArrayList<Date>();
    }

    public Date getDate(int index) {
        if(index < 0 || index > dates.size())
            throw new IndexOutOfBoundsException();

        return dates.get(index);
    }

    public void printCalender() {
        for(Date d : dates) {
            System.out.println(d.toString());
        }
    }










}