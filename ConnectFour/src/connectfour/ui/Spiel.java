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
		this.add(new JButton("Mitte"), BorderLayout.CENTER);
		this.add(new JButton("rechts"), BorderLayout.EAST);
		// statt JButton können hier auch andere JPandels stehen
	}
}
