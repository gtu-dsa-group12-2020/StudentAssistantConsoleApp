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
        assertNull(calendarObject.addAssignmentToDate(date,assignment));
    }

    @Test
    void mergeCalendars() {
        /* would be edited */
        assertTrue(true);
    }

    @Test
    void removeAssignment() {
        /* would be edited */
        assertTrue(true);
    }

    @Test
    void getDates() {
        /* would be edited */
        assertTrue(true);
    }

    @Test
    void returnCalendar() {
        /* would be edited */
        assertTrue(true);
    }
}