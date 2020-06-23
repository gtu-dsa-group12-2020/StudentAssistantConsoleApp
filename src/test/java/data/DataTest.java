package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    User userObject = new User("testUserName","testMail");
    Room roomObject = new Room("testNameOfRoom",userObject);
    Data dataObject = new Data();

    @Test
    void addUser() {
        assertTrue(dataObject.addUser(userObject));
    }

    @Test
    void addRoom() {
        assertTrue(dataObject.addRoom(roomObject));
    }

    @Test
    void getRoomById() {
        /* would be edited */
        assertNull(dataObject.getRoomById("testUserName"));
    }

    @Test
    void getUserById() {
        /* would be edited */
        assertNull(dataObject.getUserById("testNameOfRoom"));
    }

    @Test
    void removeUserById() {
        /* would be edited */
        assertNull(dataObject.removeUserById("testNameOfRoom"));
    }

    @Test
    void removeRoomById() {
        /* would be edited */
        assertNull(dataObject.removeRoomById("testUserName"));
    }
}