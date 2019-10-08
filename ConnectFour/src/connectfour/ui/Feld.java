package connectfour.ui;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Feld extends JButton
{
	public Feld()
	{
		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

	}

}
