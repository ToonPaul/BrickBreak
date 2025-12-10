package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {


	//your code here!


	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int height = 15;
	private int speed;
	private int width;
	private Color color;
	
	//constructor(s):
	public Paddle(int x, int y, int width, int speed, Color color){
		this.x = x;
		this.y = y;
		this.width = width;
		this.speed = speed;
		this.color = color;
	}

	//methods:
	public void draw(Graphic g){
		g.setColor(Color.lightGray);
		g.fillRect(x, y, width, height);
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int setX(int x){
		this.x = x;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public int getVelocity(){
		return speed;
	}
	public void move(){

	}
	public void addVelocity(int num){
		speed += num;
	}
	public void setVelocity(int speed){
		this.speed = speed;
	}

}
