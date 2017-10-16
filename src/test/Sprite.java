package test;

import java.awt.Color;
import java.io.Serializable;

public class Sprite implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7776408704350588915L;

	private String name;
	private int x;
	private int y;
	private Color color;
	private int speedx;
	private int speedy;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getSpeedx() {
		return speedx;
	}
	public void setSpeedx(int speedx) {
		this.speedx = speedx;
	}
	public int getSpeedy() {
		return speedy;
	}
	public void setSpeedy(int speedy) {
		this.speedy = speedy;
	}
	@Override
	public String toString() {
		return "Sprite [name=" + name + ", x=" + x + ", y=" + y + ", color=" + color + ", speedx=" + speedx
				+ ", speedy=" + speedy + "]";
	}
	public Sprite(String name, int x, int y, Color color, int speedx, int speedy) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
		this.color = color;
		this.speedx = speedx;
		this.speedy = speedy;
	}
	
	
	
	
}
