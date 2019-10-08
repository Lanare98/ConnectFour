package connectfour.ui;

import javax.swing.JFrame;

public class Spielfeld extends JFrame
{
	public Spielfeld()
	{
		this.setSize(1000, 1000); // 1000px hoch, 1000px breit
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // das ist das, was passiert, wenn jemand das "X" des
																// Fensters klickt
		this.setTitle("Titel");

		// hier kann noch mehr stehen

		this.setVisible(true); // der letzte Befehl, der das Fenster zeigt
	}
}
