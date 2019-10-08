package connectfour.ui;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Spiel extends JPanel
{
	JLabel lblAktuellerSpieler = new JLabel("Spieler 1 ist an der Reihe");

	public Spiel()
	{
		this.setLayout(new BorderLayout());

		// TODO Aussehen von Label festlegen lblAktuellerSpieler.set
		this.add(lblAktuellerSpieler, BorderLayout.NORTH);

		Spielfeld spielfeld = new Spielfeld();
		this.add(spielfeld, BorderLayout.CENTER);
	}

	public void setAktuellerSpieler(String aktuellerSpieler)
	{
		lblAktuellerSpieler.setText("Spieler 2 ist an der Reihe");
	}
}
