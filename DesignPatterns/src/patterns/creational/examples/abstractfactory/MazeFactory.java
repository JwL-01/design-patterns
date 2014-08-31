package patterns.creational.examples.abstractfactory;

import patterns.creational.examples.Door;
import patterns.creational.examples.Maze;
import patterns.creational.examples.Room;
import patterns.creational.examples.Wall;

public class MazeFactory
{
	public Maze makeMaze()
	{
		return new Maze();
	}

	public Wall makeWall()
	{
		return new Wall();
	}

	public Room makeRoom( int num )
	{
		return new Room( num );
	}

	public Door makeDoor( Room r1, Room r2 )
	{
		return new Door( r1, r2 );
	}
}
