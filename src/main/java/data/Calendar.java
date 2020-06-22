package data;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Calendar {
    private Map<Date,Assignment> dates;

    public Calendar() {
        this.dates = new HashMap<>();
    }

    public Assignment addAssignmentToDate(Date date,Assignment assignment) {
        return dates.putIfAbsent(date,assignment);
    }

    public Assignment removeAssignment(Date date) {
        return dates.remove(date);
    }

    public String returnCalendar() {
        Iterator<Map.Entry<Date,Assignment>> mapIterator = this.dates.entrySet().iterator();
        StringBuilder sb = new StringBuilder();
        while (mapIterator.hasNext()) {
            Map.Entry<Date,Assignment> entry = mapIterator.next();
            sb.append(entry.getValue().toString());
        }
        return sb.toString();
    }

    public void printCalender() {

    }
}