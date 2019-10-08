package connectfour.ui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class Spielfeld extends JPanel
{
	public Spielfeld()
	{
		final int rows = 5;
		final int cols = 5;
		this.setLayout(new GridLayout(rows, cols));
		this.setBackground(Color.CYAN);
	}
}