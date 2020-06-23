package Dialog;

import data.Data;
import data.User;

import java.util.Scanner;

public class LoginDialog implements Dialog {


	@Override
	public void startDialog(Data data) {
		Scanner scanner = new Scanner(System.in);
		LoginDialog loginDialog = new LoginDialog();
		int choice = -1;
		while (choice != 0) {
			System.out.println("1- Login ");

			System.out.println("0- Exit");
			choice = scanner.nextInt();
			switch (choice) {
				case 1:
					System.out.print("Username: " );
					if (loginCall(data,scanner.next()))
					break;
				case 0:
					System.out.println("Going Back!");
					break;
				default:
					System.out.println("Invalid input : " + choice);

			}
		}
	}

	private boolean loginCall(Data data, String username){
		User user = data.getUserById()
	}

	@Override
	public void finishDialog() {

	}


}
