package Dialog;

import data.Data;

import java.util.Scanner;

public class MainDialog implements Dialog {
	Data data;

	public MainDialog(Data data) {
		this.data = data;
	}

	@Override
	public void startDialog() {


		Scanner scanner = new Scanner(System.in);
		LoginDialog loginDialog = new LoginDialog(data);
		int choice = -1;
		while (choice != 0) {

			System.out.println("1- Sign-In");
			System.out.println("2- Sing-Up");
			System.out.println("0- Exit");
			choice = scanner.nextInt();
			switch (choice) {
				case 1:
					new LoginDialog(data).startDialog();
					break;
				case 2:
					new SignUpDialog(data).startDialog();

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
