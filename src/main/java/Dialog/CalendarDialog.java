package Dialog;

import data.Data;
import data.Room;
import data.User;

public class CalendarDialog implements Dialog {

	@Override
	public void startDialog(Data data) {

		throw  new  UnsupportedOperationException();

	}

	public void startDialog(Room room) {
		System.out.println(room.getRoomCalendar());
	}

	public void startDialog(User user, Data data) {
		System.out.println(user.getCalendar());

	}

	@Override
	public void finishDialog() {

	}
}
