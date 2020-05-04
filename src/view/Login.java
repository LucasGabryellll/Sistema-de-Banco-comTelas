package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends WindowJPanelGeneric{

	private JLabel labelNumberAccount, labelCPF, labelPassword;
	private JTextField fieldNumberAccount, fieldCPF;
	private JPasswordField fieldPassword;
	private JButton buttonOK;
	
	public Login(String title) {
		super(title, 280, 360);
		
		labelNumberAccount = new JLabel("Número da conta:");
		labelCPF = new JLabel("CPF");
		labelPassword = new JLabel("SENHA:");
		
		fieldNumberAccount = new JTextField(10);
		fieldCPF = new JTextField(10);
		fieldPassword = new JPasswordField(10);
		
		button = new JButton("VOLTAR");
		buttonOK = new JButton("OK");
				
		add(labelCPF);
		add(fieldCPF);
		
		add(labelNumberAccount);
		add(fieldNumberAccount);
		
		add(labelPassword);
		add(fieldPassword);
		
		add(button);
		add(buttonOK);
		
	}
	
	
	public JTextField getFieldNumberAccount() {
		return fieldNumberAccount;
	}

	public JTextField getFieldCPF() {
		return fieldCPF;
	}

	public JPasswordField getFieldPassword() {
		return fieldPassword;
	}
	
	

	public JButton getButtonOK() {
		return buttonOK;
	}

	public void setButtonOK(JButton buttonOK) {
		this.buttonOK = buttonOK;
	}
	
}
