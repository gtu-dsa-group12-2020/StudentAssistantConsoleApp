package data;

import java.util.HashMap;
import java.util.Map;

public class Data {
    Map<String, User> userMap;
    Map<String, Room> roomMap;

    public Data() {
        userMap = new HashMap<>();
        roomMap = new HashMap<>();
    }

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

    public Room getRoomById(String key) {
        return roomMap.getOrDefault(key, null);
    }

    public User getUserById(String key) {
        return userMap.getOrDefault(key, null);
    }

    public User removeUserById(String key) {
        return userMap.remove(key);
    }

    public Room removeRoomById(String key) {
        return roomMap.remove(key);
    }


}
