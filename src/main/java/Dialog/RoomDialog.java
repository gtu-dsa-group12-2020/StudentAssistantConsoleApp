package Dialog;

import data.Data;
import data.Room;
import data.User;

public class RoomDialog implements Dialog {
	Data data;
	User user;
	Room room;
	public RoomDialog(Data data,User user,Room room) {
		this.room = room;
		this.user = user;
		this.data = data;
	}

	@Override
	public void startDialog() {

	}

	@Override
	public void finishDialog() {

	}
}
