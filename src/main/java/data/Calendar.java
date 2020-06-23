package data;

import java.util.*;

/**
 * The type Calendar.
 */
public class Calendar {
    private final Map<Date,Assignment> dates;

    /**
     * Instantiates a new Calendar.
     */
    public Calendar() {
        this.dates = new HashMap<>();
    }

    /**
     * Add assignment to date assignment.
     *
     * @param date       the date
     * @param assignment the assignment
     * @return the assignment
     */
    public Assignment addAssignmentToDate(Date date,Assignment assignment) {
        return dates.putIfAbsent(date,assignment);
    }

    /**
     * Merge calendars.
     *
     * @param roomCalendar the room calendar
     */
    public void mergeCalendars(Calendar roomCalendar) {
        dates.putAll(roomCalendar.dates);
    }

    /**
     * Remove assignment assignment.
     *
     * @param date the date
     * @return the assignment
     */
    public Assignment removeAssignment(Date date) {
        return dates.remove(date);
    }

    /**
     * Gets dates.
     *
     * @return the dates
     */
    public Map<Date, Assignment> getDates() {
        return dates;
    }

    /**
     * Return calendar string.
     *
     * @return the string
     */
    public String returnCalendar() {
        Map<Date,Assignment> treeMap = new TreeMap<>(this.dates);
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Date,Assignment> entry: treeMap.entrySet()) {
            sb.append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}