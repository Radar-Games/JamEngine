package com.thomas.engine.gameobjects;

import java.awt.geom.Rectangle2D;

import com.thomas.engine.GameContainer;
import com.thomas.engine.Renderer;
import com.thomas.engine.gfx.Image;

public class StaticSolidRect 
{
	private Image image;
	private Rectangle2D.Float rect;
		
	private boolean isAlpha;
	private int x, y;
	private int width, height;
	private int zDepth;
	private int isLightBlock;
	
	public StaticSolidRect(String path, boolean isAlpha, int isLightBlock, int zDepth, int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.isAlpha = isAlpha;
		this.zDepth = zDepth;
		this.isLightBlock = isLightBlock;
		
		image = new Image(path);
		image.setAlpha(this.isAlpha);
		image.setLightBlock(this.isLightBlock);
		
		rect = new Rectangle2D.Float(x, y, width, height);
		rect.setFrame(x, y, width, height);
	}
	
	public void update(GameContainer gc)
	{
		
	}
	
	public void render(Renderer r)
	{
		r.drawImage(image, x, y);
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Rectangle2D.Float getRect() {
		return rect;
	}

	public void setRect(Rectangle2D.Float rect) {
		this.rect = rect;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getzDepth() {
		return zDepth;
	}

	public void setzDepth(int zDepth) {
		this.zDepth = zDepth;
	}
}
