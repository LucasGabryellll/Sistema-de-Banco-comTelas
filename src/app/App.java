package app;

import controller.ControllerScreens;
import model.AccountCorrent;
import model.Bank;
import view.WindowMain;

public class App {
	
	public static void main(String[] args) {
		WindowMain tela = new WindowMain("TELA");
		AccountCorrent conta = new AccountCorrent(123, "123");
		Bank.addAccount(conta);
		
		ControllerScreens controllerScreens = new ControllerScreens(tela);
	}
}
