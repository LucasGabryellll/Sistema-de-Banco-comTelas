package view;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public abstract class WindowJPanelGeneric extends JPanel {
	
	protected JButton button;
	
	public WindowJPanelGeneric(String title, int width, int height) {
		
		setSize(width, height);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		setBorder(BorderFactory.createTitledBorder(title));
		
		setVisible(false);
	
	}
		
	public JButton getButton() {
		return button;
	}

	public JButton setButton(JButton button) {
		return this.button = button;
	}
	
}
