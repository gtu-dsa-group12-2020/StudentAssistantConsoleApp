package data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void addAdmin() {
        /* would be edited */
        assertTrue(true);
    }

    @Test
    void removeAdmin() {
        /* would be edited */
        assertTrue(true);
    }

    @Test
    void getCodeOfRoom() {
        /* would be edited */
        assertTrue(true);
    }

    @Test
    void getNameOfRoom() {
        /* would be edited */
        assertTrue(true);
    }

    @Test
    void getUserAVLTree() {
        /* would be edited */
        assertTrue(true);
    }

    @Test
    void getAdmins() {
        /* would be edited */
        assertTrue(true);
    }

    @Test
    void generateRoomCode() {
        /* would be edited */
        assertTrue(true);
    }

    @Test
    void compareTo() {
        /* would be edited */
        assertTrue(true);
    }

    @Test
    void addAsignment() {
    }

    @Test
    void getRoomCalendar() {
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
    }

    @Test
    void testGetUserAVLTree() {
    }

    @Test
    void testGetAdmins() {
    }

    @Test
    void testGenerateRoomCode() {
    }

    @Test
    void testCompareTo() {
    }
}