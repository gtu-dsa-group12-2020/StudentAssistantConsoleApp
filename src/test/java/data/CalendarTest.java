package data;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    Date date = new Date();
    Assignment assignment = new Assignment();
    Calendar calendarObject = new Calendar();

    @Test
    void addAssignmentToDate() {
        /* may be edited */
        assertNull(calendarObject.addAssignmentToDate(date,assignment));
    }

    @Test
    void mergeCalendars() {
        /* merges calendars */
    }

    @Test
    void removeAssignment() {
        /* may be edited */
        assertNull(calendarObject.removeAssignment(date));
    }

    @Test
    void getDates() {
        assertNotNull(calendarObject.getDates());
    }

    @Test
    void returnCalendar() {
        assertNotNull(calendarObject.returnCalendar());
    }
}