package data;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class NotificationTest {
    private Notification temp=new Notification("Test note",new Date(1998,11,05));

    @Test
    void getMesseage(){
        assertNotNull(temp.getMessage());
    }
    @Test
    void getDate(){
        assertNotNull(temp.getDate());
    }

    @Test
    void compareTo() {
        //Date temp = new Date(1998,11,05);
        Date temp2 = new Date(1998,11,05);
        assertTrue(temp.compareTo(temp2)==0);
        assertFalse(temp.compareTo(temp2)>0 || temp.compareTo(temp2)<0);
        temp2 = new Date(1995,11,05);
        assertTrue(temp.compareTo(temp2)>0);
        assertFalse(temp.compareTo(temp2)==0 || temp.compareTo(temp2)<0);
        temp2 = new Date(2008,11,05);
        assertTrue(temp.compareTo(temp2)<0);
        assertFalse(temp.compareTo(temp2)==0 || temp.compareTo(temp2)>0);
    }

}