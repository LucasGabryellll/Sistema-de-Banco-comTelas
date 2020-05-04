package view;

import java.awt.CardLayout;

import javax.swing.JFrame;

public abstract class WindowJFrameGeneric extends JFrame {
	
	private CardLayout cartLayout;
	
	public WindowJFrameGeneric(String title, int width, int height) {
		super(title);
		setSize(width, height);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		cartLayout = new CardLayout();
		setLayout(cartLayout);
		
		setVisible(true);
		
	}
	
	public void changeScreen(String screen) {
		
		cartLayout.show(getContentPane(), screen);
	}
}
