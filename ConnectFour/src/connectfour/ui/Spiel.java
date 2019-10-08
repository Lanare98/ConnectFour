package connectfour.ui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Spiel extends JPanel
{
	public Spiel()
	{
		this.setLayout(new BorderLayout());
		this.add(new JButton("oben"), BorderLayout.NORTH);

		Spielfeld spielfeld = new Spielfeld();
		this.add(spielfeld, BorderLayout.CENTER);
	}
}
