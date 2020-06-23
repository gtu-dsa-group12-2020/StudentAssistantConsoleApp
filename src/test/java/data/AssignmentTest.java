package data;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentTest {
    Date temp = new Date(1998,11,05);
    Assignment assignment= new Assignment();

    AssignmentTest(){
        assignment.setAssigmentDate(temp);
    }

    @Test
    void getAssignmentDate(){
        assertNotNull(assignment.getAssigmentDate());
    }

    @Test
    void compareTo() {
        Date temp2 = new Date(1998,11,05);
        assertTrue(assignment.compareTo(temp2)==0);
        assertFalse(assignment.compareTo(temp2)<0 || assignment.compareTo(temp2)>0);
        temp = new Date(2008,11,05);
        assignment= new Assignment();
        assignment.setAssigmentDate(temp);
        temp2 = new Date(1998,11,05);
        assertTrue(temp.compareTo(temp2)>0);
        assertFalse(assignment.compareTo(temp2)==0 || assignment.compareTo(temp2)<0);
        temp = new Date(2005,11,05);
        assignment= new Assignment();
        assignment.setAssigmentDate(temp);
        temp2 = new Date(2008,11,05);
        assertTrue(temp.compareTo(temp2)<0);
        assertFalse(assignment.compareTo(temp2)==0 || assignment.compareTo(temp2)>0);
    }

}