package com.thomas.engine;

public abstract class AbstractGame 
{
	public abstract void initialize(GameContainer gc);
	public abstract void update(GameContainer gc, float dt);
	public abstract void render(GameContainer gc, Renderer r);
}
