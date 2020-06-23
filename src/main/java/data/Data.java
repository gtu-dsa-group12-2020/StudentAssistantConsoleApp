package data;

import java.util.HashMap;
import java.util.Map;

/**
 * Class for representing Data
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
     * No Parameter Constructor Method, instantiates a Data
     */
    public Data() {
        userMap = new HashMap<>();
        roomMap = new HashMap<>();
    }

    /**
     * Adds user to user map
     *
     * @param user The User object
     * @return True if user added, false otherwise
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
     * Adds room to room map
     *
     * @param room The Room object
     * @return True if room added, false otherwise
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
     * Gets a Room by the given key
     *
     * @param key The Key of the room map
     * @return The Room object
     */
    public Room getRoomById(String key) {
        return roomMap.getOrDefault(key, null);
    }

    /**
     * Gets a User by the given key
     *
     * @param key The Key of the user map
     * @return The User object
     */
    public User getUserById(String key) {
        return userMap.getOrDefault(key, null);
    }

    /**
     * Removes a User by the given key
     *
     * @param key The Key of the user map
     * @return The User object
     */
    public User removeUserById(String key) {
        return userMap.remove(key);
    }

    /**
     * Removes a Room by the given key
     *
     * @param key The Key of the room map
     * @return The Room object
     */
    public Room removeRoomById(String key) {
        return roomMap.remove(key);
    }


}
