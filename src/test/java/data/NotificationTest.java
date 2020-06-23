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

   

}
