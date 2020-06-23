package Dialog;

import data.Data;
import data.User;

import java.util.Scanner;

public class MainDialog  implements Dialog{
	User user;

	Data data;

	@Override
	public void startDialog(Data data) {

		this.data  = data;
		Scanner scanner = new Scanner(System.in);
		LoginDialog loginDialog = new LoginDialog();
		int choice = -1;
		while (choice != 0 ){

			System.out.println("1- Sign-In");
			System.out.println("2- Sing-Up");
			System.out.println("1- Exit");
			choice = scanner.nextInt();
			switch (choice){
				case 1:
				case 2:
				case 3:
				default:

			}

		}

	}

	@Override
	public void finishDialog() {

	}
}
