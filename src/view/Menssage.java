package view;

import javax.swing.JOptionPane;

public class Menssage {
	
	public static void menssage(String text) {
		JOptionPane.showMessageDialog(null, text);
	}
	
	public static Double transfer() {
		String v = JOptionPane.showInputDialog("VALOR?");
		Double valor = Double.parseDouble(v);
		System.out.println(valor);
		return valor;
		
	}
	
}
