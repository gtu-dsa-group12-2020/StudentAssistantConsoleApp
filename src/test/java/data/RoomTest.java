package data;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testAddAsignment() {
        User userObject = new User("testUserName","testMail");
        Room roomObject = new Room("testNameOfRoom",userObject);
        Date date = new Date();
        Assignment assignment = new Assignment();
        /* it may be edited */
        assertFalse(roomObject.addAsignment(date,assignment));
    }

    @Test
    void testGetRoomCalendar() {
        User userObject = new User("testUserName","testMail");
        Room roomObject = new Room("testNameOfRoom",userObject);

        assertNotNull(roomObject.getRoomCalendar());
    }

    @Test
    void testAddAdmin() {
        User userObject1 = new User("testUserName1","testMail1");
        Room roomObject = new Room("testNameOfRoom",userObject1);
        User userObject2 = new User("testUserName2","testMail2");

        assertTrue(roomObject.addAdmin(userObject2));
    }

    @Test
    void testRemoveAdmin() {
        User userObject = new User("testUserName","testMail");
        Room roomObject = new Room("testNameOfRoom",userObject);

        assertTrue(roomObject.removeAdmin(userObject));
    }

    @Test
    void testGetCodeOfRoom() {
        User userObject = new User("testUserName","testMail");
        Room roomObject = new Room("testNameOfRoom",userObject);

        assertNotNull(roomObject.getCodeOfRoom());
    }

    @Test
    void testGetNameOfRoom() {
        User userObject = new User("testUserName","testMail");
        Room roomObject = new Room("testNameOfRoom",userObject);

        assertNotNull(roomObject.getNameOfRoom());
    }

    @Test
    void testGetUserAVLTree() {
        User userObject = new User("testUserName","testMail");
        Room roomObject = new Room("testNameOfRoom",userObject);
        /* if add user avl tree method, here may be edited */
        assertNotNull(roomObject.getUserAVLTree());
    }

    @Test
    void testGetAdmins() {
        User userObject1 = new User("testUserName1","testMail1");
        Room roomObject = new Room("testNameOfRoom",userObject1);
        User userObject2 = new User("testUserName2","testMail2");
        roomObject.addAdmin(userObject2);

        assertNotNull(roomObject.getAdmins());
    }

    @Test
    void testGenerateRoomCode() {
        User userObject = new User("testUserName","testMail");
        Room roomObject = new Room("testNameOfRoom",userObject);

        assertNotNull(roomObject.generateRoomCode());
    }

    @Test
    void testCompareTo() {
        User userObject = new User("testUserName","testMail");
        Room roomObject = new Room("testNameOfRoom",userObject);

        assertEquals(roomObject.compareTo("testNameOfRoom"),0);
    }
}