package data;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class NotificationTest {

    @Test
    void compareTo() {
        Date temp = new Date(1998,11,05);
        Date temp2 = new Date(1998,11,05);
        assertTrue(temp.compareTo(temp2)==0);
        temp = new Date(2008,11,05);
        temp2 = new Date(1998,11,05);
        assertTrue(temp.compareTo(temp2)>0);
        temp = new Date(2005,11,05);
        temp2 = new Date(2008,11,05);
        assertTrue(temp.compareTo(temp2)<0);
    }
}