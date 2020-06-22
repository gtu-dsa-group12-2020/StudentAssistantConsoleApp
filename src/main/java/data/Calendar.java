package data;

import java.util.*;

public class Calendar {
    private final Map<Date,Assignment> dates;

    public Calendar() {
        this.dates = new HashMap<>();
    }

    public Assignment addAssignmentToDate(Date date,Assignment assignment) {
        return dates.putIfAbsent(date,assignment);
    }

    public void mergeCalendars(Calendar roomCalendar) {
        dates.putAll(roomCalendar.dates);
    }

    public Assignment removeAssignment(Date date) {
        return dates.remove(date);
    }

    public Map<Date, Assignment> getDates() {
        return dates;
    }

    public String returnCalendar() {
        Map<Date,Assignment> treeMap = new TreeMap<>(this.dates);
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Date,Assignment> entry: treeMap.entrySet()) {
            sb.append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}