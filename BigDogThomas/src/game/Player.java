package game;

import com.thomas.engine.GameContainer;
import com.thomas.engine.Input;
import com.thomas.engine.Renderer;

import sun.misc.GC;

public class Player 
{
	private Input input;
	
	public Player(GameContainer gc, Renderer r)
	{
		this.input = gc.getInput();
	}
	
	public void update()
	{
		
	}
}
