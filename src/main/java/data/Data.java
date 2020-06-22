package data;

import java.util.HashMap;
import java.util.Map;

public class Data {
	Map<String, User> userMap;
	Map<String, Room> roomMap;

	public Data() {
		userMap = new HashMap<String, User>();
		roomMap = new HashMap<String, Room>();
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
		if (roomMap.containsKey(key))
			return roomMap.get(key);
		else
			return null;
	}

	public User getUserById(String key) {
		if (userMap.containsKey(key))
			return userMap.get(key);
		else
			return null;
	}

	public User removeUserById(String key) {
		if (userMap.containsKey(key)) {
			return userMap.remove(key);
		} else return null;
	}

	public Room removeRoomById(String key) {
		if (roomMap.containsKey(key)) {
			return roomMap.remove(key);
		} else return null;
	}


}
