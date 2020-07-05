package Dialog;

import data.Data;
import data.Room;
import data.User;

import java.util.Scanner;


public class
UserFeedDialog {
	User user;
	Data data;

	public UserFeedDialog(User user, Data data) {
		this.user = user;

	}

	public void startDialog() {
		//TODO : avarage dialog bağlantısını yap
		Scanner scanner = new Scanner(System.in);
		LoginDialog loginDialog = new LoginDialog(data);
		int choice = -1;
		while (choice != 0) {

			System.out.println("1- show rooms");
			System.out.println("2- show notifications");
			System.out.println("3- show assignments");
			System.out.println("4- calculate average");
			System.out.println("5- create room");
			System.out.println("6 - join room");
			System.out.println("0- Exit");
			choice = scanner.nextInt();
			switch (choice) {
				case 1:
					System.out.println(user.roomList());

					break;
				case 2:
					System.out.println(user.getRoomString());

					break;
				case 3:
					new CalendarDialog().startDialog(user, data);
					break;
				case 4:
					new AverageDialog().startDialog();
					break;
				case 5:
					if (createRoom()) {
						System.out.println("Successful!");
					}
					else System.out.println("Unsuccessful!");
					break;
				case 6:
				case 0:
					System.out.println("Going Back!");
					break;
				default:
					System.out.println("Invalid input : " + choice);

			}

		}

	}


	private boolean createRoom() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the room name:");
		String roomName = scanner.next();
		return data.addRoom(new Room(roomName, user));
	}
	private boolean joinRoom(){
		//TODO : methodun idye göre doğru şekilde ekleme yaptığından emin ol
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter id of room:");
		String  id = scanner.next();
		data.getRoomById(id).addUser(user);
	}

}
