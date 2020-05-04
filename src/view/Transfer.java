package view;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Transfer extends WindowJPanelGeneric{

	private JButton buttonTake, buttonDeposit, buttonTransfer;
	private JLabel labelBalance;
	
	public Transfer(String title) {
		super(title, 280, 360);
		
		button = new JButton("VOLTAR");
		buttonTake = new JButton("SACAR");
		buttonDeposit = new JButton("DEPOSITAR");
		buttonTransfer = new JButton("TRANSFERIR");
		
		labelBalance = new JLabel();
		
		add(labelBalance);
		
		add(button);
		add(buttonTake);
		add(buttonDeposit);
		add(buttonTransfer);
		
	}
	
	public JLabel getLabelBalance() {
		return labelBalance;
	}

	public JButton getButtonTake() {
		return buttonTake;
	}

	public JButton getButtonDeposit() {
		return buttonDeposit;
	}

	public JButton getButtonTransfer() {
		return buttonTransfer;
	}
}
