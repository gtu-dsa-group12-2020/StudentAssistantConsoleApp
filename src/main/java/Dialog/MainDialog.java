package Dialog;

import data.Data;

import java.util.Scanner;

public class MainDialog implements Dialog {

	@Override
	public void startDialog(Data data) {


		Scanner scanner = new Scanner(System.in);
		LoginDialog loginDialog = new LoginDialog();
		int choice = -1;
		while (choice != 0) {

			System.out.println("1- Sign-In");
			System.out.println("2- Sing-Up");
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

	@Override
	public void finishDialog() {

	}
}
