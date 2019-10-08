package connectfour.ui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class Spielfeld extends JPanel
{
	public Spielfeld()
	{
		final int rows = 6;
		final int cols = 7;
		this.setLayout(new GridLayout(rows, cols));
		this.setBackground(Color.CYAN);
		for (int i = 0; i < rows * cols; i++)
		{
			this.add(new Feld());
		}
	}
}