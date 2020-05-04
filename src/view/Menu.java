package view;

import javax.swing.JButton;

public class Menu extends WindowJPanelGeneric {
	
	private JButton buttonRegister;
	private JButton buttonLogin;
	private JButton buttonExit;
	
	public Menu(String title) {
		super(title, 280, 360);
		
		buttonRegister = new JButton("CADASTRAR");
		buttonLogin = new JButton("LOGIN");
		buttonExit = new JButton("SAIR");
		
		
		add(buttonRegister);
		add(buttonLogin);
		add(buttonExit);
		
		setVisible(true);
	}

	public JButton getButtonRegister() {
		return buttonRegister;
	}

	public JButton getButtonLogin() {
		return buttonLogin;
	}

	public JButton getButtonExit() {
		return buttonExit;
	}
	
}
