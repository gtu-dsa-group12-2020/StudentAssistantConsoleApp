package data;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Data.
 */
public class Data {
    /**
     * The User map.
     */
    Map<String, User> userMap;
    /**
     * The Room map.
     */
    Map<String, Room> roomMap;

    /**
     * Instantiates a new Data.
     */
    public Data() {
        userMap = new HashMap<>();
        roomMap = new HashMap<>();
    }

    /**
     * Add user boolean.
     *
     * @param user the user
     * @return the boolean
     */
    public boolean addUser(User user) {
        if (user == null)
            return false;
        if (userMap.containsKey(user.getProfile().getUserName()))
            return false;
        else {
            userMap.put(user.getProfile().getUserName(), user);
            return true;
        }
    }

    /**
     * Add room boolean.
     *
     * @param room the room
     * @return the boolean
     */
    public boolean addRoom(Room room) {
        if (roomMap == null)
            return false;
        if (roomMap.containsKey(room.getCodeOfRoom()))
            return false;
        else {
            roomMap.put(room.getCodeOfRoom(), room);
            return true;
        }
    }

    /**
     * Gets room by id.
     *
     * @param key the key
     * @return the room by id
     */
    public Room getRoomById(String key) {
        return roomMap.getOrDefault(key, null);
    }

    /**
     * Gets user by id.
     *
     * @param key the key
     * @return the user by id
     */
    public User getUserById(String key) {
        return userMap.getOrDefault(key, null);
    }

    /**
     * Remove user by id user.
     *
     * @param key the key
     * @return the user
     */
    public User removeUserById(String key) {
        return userMap.remove(key);
    }

    /**
     * Remove room by id room.
     *
     * @param key the key
     * @return the room
     */
    public Room removeRoomById(String key) {
        return roomMap.remove(key);
    }


}
