import Dialog.LoginDialog;
import Dialog.MainDialog;
import data.Data;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Data  data = new Data();
		MainDialog mainDialog = new MainDialog();
		mainDialog.startDialog(data);
	}
}
