package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void addRoom() {
        User temp=new User("admin","aa@aa");
        assertTrue(temp.addRoom(new Room("testRoomName",temp)));
    }

    @Test
    void removeRoom() {
        User temp=new User("admin","aa@aa");
        Room t=new Room("testRoomName", temp);
        temp.addRoom(t);
        assertTrue(temp.removeRoom(t));
    }


    @Test
    void compareTo() {
        User temp=new User("test","test@test");
        User temp2=new User("test","test@test");
        assertTrue(temp.compareTo(temp2)==0);
        temp=new User("test","test@test");
        temp2=new User("t","test@test");
        assertTrue(temp.compareTo(temp2)>0);
        temp=new User("test","test@test");
        temp2=new User("test2","test@test");
        assertTrue(temp.compareTo(temp2)<0);
    }
}