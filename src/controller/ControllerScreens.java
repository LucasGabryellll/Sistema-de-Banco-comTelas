package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Account;
import model.AccountCorrent;
import model.AccountPoupanca;
import model.Bank;
import view.Menssage;
import view.WindowMain;

public class ControllerScreens implements ActionListener {

	WindowMain windowMain;

	public ControllerScreens(WindowMain windowMain) {
		super();
		this.windowMain = windowMain;
	
		actionsScreen();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		performedActionsMenu(e);
		performedActionRegister(e);
		performedActionLogin(e);
		performedActionTransfer(e);
	}

	public void actionsScreen() {
		//Tratamento de Eventos da Tela Menu
		
		windowMain.getMenu().getButtonLogin().addActionListener(this);
		windowMain.getMenu().getButtonRegister().addActionListener(this);
		windowMain.getMenu().getButtonExit().addActionListener(this);
		
		//Tratamento de Eventos da Tela Register
		
		windowMain.getRegister().getButton().addActionListener(this);
		windowMain.getRegister().getButtonRegister().addActionListener(this);
		
		//Tratamento de Eventos da Tela Login
		
		windowMain.getLogin().getButton().addActionListener(this);
		windowMain.getLogin().getButtonOK().addActionListener(this);
		
		//Tratamento de Eventos da Tela Transferir
		
		windowMain.getTransfer().getButton().addActionListener(this);
		windowMain.getTransfer().getButtonTake().addActionListener(this);
		windowMain.getTransfer().getButtonDeposit().addActionListener(this);
		windowMain.getTransfer().getButtonTransfer().addActionListener(this);
		
	}

	public void performedActionsMenu(ActionEvent e) {
		//Ações na tela Menu
		
		Object object = e.getSource();
		
		if (object == windowMain.getMenu().getButtonRegister()) {
			windowMain.changeScreen("register");			
			
		} else if (object == windowMain.getMenu().getButtonLogin()) {
			windowMain.changeScreen("login");
		
		} else if (object == windowMain.getMenu().getButtonExit()) {
			JOptionPane.showMessageDialog(null, "Volte Sempre");
			System.exit(0);
		}
	}
	
	public void performedActionRegister(ActionEvent e) {
		//Ações na Tela Register
		
		Object object = e.getSource();
		
		if (object == windowMain.getRegister().getButton()) {
			windowMain.changeScreen("menu");
			
		} else if (object == windowMain.getRegister().getButtonRegister()) {
			
			if (windowMain.getRegister().getRadioCurrent().isSelected()) {
				if (windowMain.getRegister().getFieldPassword().getText().equals(windowMain.getRegister().getFieldPasswordConfirm().getText())) {
					AccountCorrent corrente = new AccountCorrent(Integer.parseInt(windowMain.getRegister().getFieldNumberAccount().getText()), 
							windowMain.getLogin().getFieldPassword().getText());
					
					if (Bank.addAccount(corrente)) {
						Menssage.menssage("Conta Corrente cadastrada com sucesso!");
						windowMain.changeScreen("menu");
						
					} else { Menssage.menssage("Conta já cadastrada"); }
					
				} else { Menssage.menssage("Erro, senhas não são Iguais"); }
				
			} else if (windowMain.getRegister().getRadioSavings().isSelected()) {
				
				if (windowMain.getRegister().getFieldPassword().getText().equals(windowMain.getRegister().getFieldPasswordConfirm().getText())) {
					AccountPoupanca poupanca = new AccountPoupanca(Integer.parseInt(windowMain.getRegister().getFieldNumberAccount().getText()),
							windowMain.getLogin().getFieldPassword().getText());
					
					if (Bank.addAccount(poupanca)) {
						Menssage.menssage("Conta Poupança cadastrada com sucesso!");
						windowMain.changeScreen("menu");
						
					} else { Menssage.menssage("Conta já cadastrada!"); }
					
				} else { Menssage.menssage("Erro, senhas não são Iguais!"); }
			}
		}
	}
	
	public void performedActionLogin(ActionEvent e) {
		// Ações na tenha Login
		
		Object object = e.getSource();
		
		if (object == windowMain.getLogin().getButton()) {
			windowMain.changeScreen("menu");
			
		} else if (object == windowMain.getLogin().getButtonOK()) {
			
			if (Bank.fetchAccount(Integer.parseInt(windowMain.getLogin().getFieldNumberAccount().getText()), windowMain.getLogin().getFieldPassword().getText())) {
				int numberConta = Integer.parseInt(windowMain.getLogin().getFieldNumberAccount().getText());
				Account conta = Bank.fetchAccount(numberConta);
				windowMain.getTransfer().getLabelBalance().setText("SALDO:" + conta.getBalance());
				windowMain.changeScreen("transferencia");
					
			} else { Menssage.menssage("Não Logado, número de conta ou senha incorreto"); }
		}
	}
	
	public void performedActionTransfer(ActionEvent e) {
		//Ações na tela Transferir
		
		Object object = e.getSource();
		
		if (object == windowMain.getTransfer().getButton()) {
			windowMain.changeScreen("login");
		
		} else if (object == windowMain.getTransfer().getButtonTake()) {
			
			if (Bank.fetchAccount(Integer.parseInt(windowMain.getLogin().getFieldNumberAccount().getText()), windowMain.getLogin().getFieldPassword().getText())) {
				int numberConta = Integer.parseInt(windowMain.getLogin().getFieldNumberAccount().getText());
				Account conta = Bank.fetchAccount(numberConta);
				Double valor =  Menssage.transfer();
				if (conta.take(valor)) {
					windowMain.getTransfer().getLabelBalance().setText("SALDO:" + conta.getBalance());
				
				} else { JOptionPane.showMessageDialog(null, "SALDO INDISPONÍVEL!"); }
				
			}
			
		} else if (object == windowMain.getTransfer().getButtonDeposit()) {
			
			if (Bank.fetchAccount(Integer.parseInt(windowMain.getLogin().getFieldNumberAccount().getText()), windowMain.getLogin().getFieldPassword().getText())) {
				int numberConta = Integer.parseInt(windowMain.getLogin().getFieldNumberAccount().getText());
				Account conta = Bank.fetchAccount(numberConta);
				Double valor =  Menssage.transfer();
				if (conta.deposit(valor)) {
					windowMain.getTransfer().getLabelBalance().setText("SALDO:" + conta.getBalance());
					
				} else { JOptionPane.showMessageDialog(null, "NÃO É POSSIVEL DEPOSITAR ESSE VALOR!"); }
	
			}

		} else if (object == windowMain.getTransfer().getButtonTransfer()) {
			System.out.println("falta fazer");
		}
			
	}
}
