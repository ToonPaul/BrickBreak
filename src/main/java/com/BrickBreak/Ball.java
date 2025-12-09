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
	public int getXpos(){
		
	}
	public int getYpos(){

	}
	public int getSize(){

	}
	
}
