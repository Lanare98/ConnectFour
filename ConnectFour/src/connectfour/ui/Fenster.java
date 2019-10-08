package connectfour.ui;

import javax.swing.JFrame;

public class Fenster extends JFrame
{
	public Fenster()
	{
		this.setSize(1000, 1000); // 1000px hoch, 1000px breit
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // das ist das, was passiert, wenn jemand das "X" des
																// Fensters klickt
		this.setTitle("Vier Gewinnt");
		Spiel spiel = new Spiel();
		this.add(spiel);

		this.setVisible(true); // der letzte Befehl, der das Fenster zeigt
	}
}
