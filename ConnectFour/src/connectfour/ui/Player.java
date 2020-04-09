package connectfour.ui;

import java.util.ArrayList;
import java.util.List;

public class Player
{
	private final String name;
	private int points = 0;

	public Player(String name)
	{
		this.name = name;

		List<String> list = new ArrayList<>();
		list.forEach(obst -> System.out.println(obst));

	}
}
