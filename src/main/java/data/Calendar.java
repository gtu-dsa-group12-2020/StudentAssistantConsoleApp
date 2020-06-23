package data;

import java.util.*;

/**
 * Class for representing Calendar
 */
public class Calendar {
    /**
     * crate ne dates in calender and we use map
     */
    private final Map<Date,Assignment> dates;

    /**
     * No Parameter Constructor Method, instantiates a Calendar
     */
    public Calendar() {
        this.dates = new HashMap<>();
    }

    /**
     * Adds an Assignment to a Date
     *
     * @param date       Date of the Assignment to add
     * @param assignment Assignment on the Date to add
     * @return The Assignment object that added
     */
    public Assignment addAssignmentToDate(Date date,Assignment assignment) {
        return dates.putIfAbsent(date,assignment);
    }

    /**
     * Merges calendar with calendar of any room
     *
     * @param roomCalendar Calendar of any Room
     */
    public void mergeCalendars(Calendar roomCalendar) {
        dates.putAll(roomCalendar.dates);
    }

    /**
     * Removes an assignment on a date
     *
     * @param date Date of the Assignment to remove
     * @return The Assignment object that removed
     */
    public Assignment removeAssignment(Date date) {
        return dates.remove(date);
    }

    /**
     * Gets dates in a Calendar
     *
     * @return Give dates map
     */
    public Map<Date, Assignment> getDates() {
        return dates;
    }

    /**
     * Gives a Calendar as a String
     *
     * @return Returns Calendar as a String (similar to toString)
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