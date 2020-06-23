package data;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    User userObject = new User("testUserName","testMail");
    User userObject2 = new User("testUserName2","testMail2");
    Room roomObject = new Room("testNameOfRoom",userObject);
    Date date = new Date();
    Assignment assignment = new Assignment();

    @Test
    void testAddAsignment() {
        /* it may be edited */
        assertFalse(roomObject.addAsignment(date,assignment));
    }

    @Test
    void testGetRoomCalendar() {
        assertNotNull(roomObject.getRoomCalendar());
    }

    @Test
    void testAddAdmin() {
        assertTrue(roomObject.addAdmin(userObject2));
    }

    @Test
    void testRemoveAdmin() {
        assertTrue(roomObject.removeAdmin(userObject));
    }

    @Test
    void testGetCodeOfRoom() {
        assertNotNull(roomObject.getCodeOfRoom());
    }

    @Test
    void testGetNameOfRoom() {
        assertNotNull(roomObject.getNameOfRoom());
    }

    @Test
    void testGetUserAVLTree() {
        /* if add user avl tree method, here may be edited */
        assertNotNull(roomObject.getUserAVLTree());
    }

    @Test
    void testGetAdmins() {
        assertNotNull(roomObject.getAdmins());
    }

    @Test
    void testGenerateRoomCode() {
        assertNotNull(roomObject.generateRoomCode());
    }

    @Test
    void testCompareTo() {
        assertEquals(roomObject.compareTo("testNameOfRoom"),0);
    }
}