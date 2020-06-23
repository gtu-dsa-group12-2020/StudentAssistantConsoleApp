package Dialog;

import data.Data;
import data.User;

import java.util.Scanner;
import java.util.concurrent.ConcurrentSkipListMap;

public class
UserFeedDialog {

	public UserFeedDialog(User user, Data data){

		Scanner scanner = new Scanner(System.in);
		LoginDialog loginDialog = new LoginDialog();
		int choice = -1;
		while (choice != 0) {

			System.out.println("1- show my rooms");
			System.out.println("2- show my notification");
			System.out.println("2- show assignment");
			System.out.println("2- show notification");
			System.out.println("0- Exit");
			choice = scanner.nextInt();
			switch (choice) {
				case 1:
					new LoginDialog().startDialog(data);
					break;
				case 2:
					new SignUpDialog().startDialog(data);

					break;
				case 0:
					System.out.println("Going Back!");
					break;
				default:
					System.out.println("Invalid input : " + choice);

			}

		}





	}

}
