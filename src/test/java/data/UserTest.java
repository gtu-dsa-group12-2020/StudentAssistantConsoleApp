package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User temp=new User("test","test@test");

    @Test
    void addRoom() {
        assertTrue(temp.addRoom(new Room("testRoomName",temp)));
    }

    @Test
    void removeRoom() {
        Room t=new Room("testRoomName", temp);
        temp.addRoom(t);
        assertTrue(temp.removeRoom(t));
        assertFalse(temp.removeRoom(new Room("wrong room",temp)));
    }
    @Test
    void getProfile(){
        assertNotNull(temp.getProfile());
    }
    @Test
    void roomList(){
        assertNotNull(temp.roomList());
    }

    @Test
    void compareTo() {
        User temp2=new User("test","test@test");
        assertTrue(temp.compareTo(temp2)==0);
        assertFalse(temp.compareTo(temp2)>0 || temp.compareTo(temp2)<0);
        temp=new User("test","test@test");
        temp2=new User("t","test@test");
        assertTrue(temp.compareTo(temp2)>0);
        assertFalse(temp.compareTo(temp2)==0 || temp.compareTo(temp2)<0);
        temp=new User("test","test@test");
        temp2=new User("test2","test@test");
        assertTrue(temp.compareTo(temp2)<0);
        assertFalse(temp.compareTo(temp2)==0 || temp.compareTo(temp2)>0);
    }

}