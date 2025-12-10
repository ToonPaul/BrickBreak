//Name: Paul Hudalla
//description of class

package com.BrickBreak;
import java.awt.*;
import java.awt.Color;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private double changeX;
	private double changeY;
	private int size;
	private Color color;
	
	//constructor(s):
	public Ball (int x, int y, int changeX, int changeY, Color color, int size){
		this.x = x;
		this.y = y;
		this.changeX = changeX;
		this.changeY = changeY;
		this.color = color;
		this.size = size;
	}

	//methods:
	public void draw(Graphics g){
		g.setColor(Color.cyan);
		g.fillOval(x, y, size, size);
	}
	public void moveBall(){
		x += changeX;
		y += changeY;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public void reverseX(){
		changeX *= -1;
	}
	public void reverseY(){
		changeY *= -1;
	}
	public int getXpos(){
		return x;
	}
	public int getYpos(){
		return y;
	}
	public int getSize(){
		return size;
	}
	public double getChangeX(){
		return changeX;
	}
	public double getChangeY(){
		return changeY;
	}
	public void setXVelocity(int changeX){
		this.changeX = changeX;
	}
	public void setYVelocity(int changeY){
		this.changeY = changeY;
	}
}
