package Dialog;

import data.Data;
import data.User;

public class RoomDialog implements Dialog {
	Data data;
	User user;

	public RoomDialog(Data data, User user) {
		this.data = data;
		this.user = user;
	}

	@Override
	public void startDialog() {

	}

	@Override
	public void finishDialog() {

	}
}
