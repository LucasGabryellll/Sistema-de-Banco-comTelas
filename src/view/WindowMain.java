package view;

public class WindowMain extends WindowJFrameGeneric {
	
	private Menu menu;
	private Login login;
	private Register register;
	private Transfer transfer;
	
	public WindowMain(String title) {
		
		super(title, 280, 360);
		
		menu = new Menu("Menu");
		register = new Register("Cadastro");
		login = new Login("Login");
		transfer = new Transfer("Transferência");
		
		add(menu, "menu");
		add(register, "register");
		add(login,"login");
		add(transfer,"transferencia");
		
		changeScreen("menu");
		
		setVisible(true);
		
	}

	public Menu getMenu() {
		return menu;
	}

	public Login getLogin() {
		return login;
	}

	public Register getRegister() {
		return register;
	}

	public Transfer getTransfer() {
		return transfer;
	}

}
