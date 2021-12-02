package javaSwing;

import javax.swing.*;

public class Exemplo01Botao {

	public static void main(String[] args) {
		JFrame f = new JFrame("Exibir botão");
		JButton b = new JButton("Clique");
		b.setBounds(50, 100, 120, 60);
		f.add(b);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
