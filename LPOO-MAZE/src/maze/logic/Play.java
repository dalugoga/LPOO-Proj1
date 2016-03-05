package maze.logic;

import maze.cli.Interface;

public class Play 
{
	private Interface i = new Interface();
	private Maze maze = new Maze();
	private Hero h = new Hero(1,1,'H');
	private Dragon d = new Dragon (8,1,'D');
	
	public void gamePlay()
	{
		maze.printCell(h.getCharacterPosition(),h);
		maze.printCell(d.getCharacterPosition(), d);
		
		
		i.printMaze(maze);
		maze.moveHandler(h);
		i.printMaze(maze);
	}
	

}
