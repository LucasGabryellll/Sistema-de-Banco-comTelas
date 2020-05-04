package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Register extends WindowJPanelGeneric{

	private JLabel labelCPF, labelNumberAccount, labelPassword, labelConfirmPassword;
	private JTextField fieldCPF, fieldNumberAccount;
	private JPasswordField fieldPassword, fieldPasswordConfirm;
	private JButton buttonRegister;
	private JRadioButton radioSavings, radioCurrent;
	
	public Register(String title) {
		super(title, 400, 400);
		
		instanceOfObject();
		
		add(labelCPF);
		add(fieldCPF);
				
		add(labelNumberAccount);
		add(fieldNumberAccount);
		
		add(labelPassword);
		add(fieldPassword);
		add(labelConfirmPassword);
		add(fieldPasswordConfirm);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioSavings);
		group.add(radioCurrent);
		
		add(radioSavings);
		add(radioCurrent);
		add(button);
		add(buttonRegister);
		
	}
	
	public void instanceOfObject() {
		//Instancias do Atributos que irei usar
		
		labelCPF = new JLabel("CPF:");
		labelNumberAccount = new JLabel("NUMERO DA CONTA:"); 
		labelPassword = new JLabel("SENHA");
		labelConfirmPassword = new JLabel("CONFIRME SENHA");
		
		fieldCPF = new JTextField(10);
		fieldNumberAccount = new JTextField(10);
		
		fieldPassword = new JPasswordField(10);
		fieldPasswordConfirm = new JPasswordField(10);
		
		radioSavings = new JRadioButton("Poupança");
		radioCurrent = new JRadioButton("Corrent");
		
		button = new JButton("VOLTAR");
		buttonRegister = new JButton("CADASTRAR");
	}

	public JTextField getFieldCPF() {
		return fieldCPF;
	}

	public JTextField getFieldNumberAccount() {
		return fieldNumberAccount;
	}

	public JPasswordField getFieldPassword() {
		return fieldPassword;
	}

	public JPasswordField getFieldPasswordConfirm() {
		return fieldPasswordConfirm;
	}

	public JButton getButtonRegister() {
		return buttonRegister;
	}

	public JRadioButton getRadioSavings() {
		return radioSavings;
	}

	public JRadioButton getRadioCurrent() {
		return radioCurrent;
	}
	
}
