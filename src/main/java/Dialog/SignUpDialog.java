package Dialog;

import data.Data;
import data.User;

import java.util.Scanner;

public class SignUpDialog implements Dialog {
	Data data;

	public SignUpDialog(Data data) {
		this.data = data;
	}

	@Override
	public void startDialog() {
		Scanner scanner = new Scanner(System.in);
		int choice = -1;
		while (choice != -1) {
			System.out.println("1 - Sing-Up");
			System.out.println("0 - Back");
			choice = scanner.nextInt();
			switch (choice) {
				case 1:
					String userName = scanner.next();
					String mail = scanner.next();
					if(!data.addUser(new User(userName,mail))) {
						System.out.println("Successful!");
						new LoginDialog(data);
					}
					else System.out.println("This username already taken! ");
				case 0 : return;
				default:
					System.out.println("Invalid input!");
			}


		}
	}

	@Override
	public void finishDialog() {

	}
}
