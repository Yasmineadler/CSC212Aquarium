package edu.smith.cs.csc212.aquarium;

import java.awt.Color;

import java.util.Random;

import java.awt.Graphics2D;

public class Fish {
	int x;
	int y;
	Color color;
	boolean isLittle;
	boolean isLeft;
	private int destY;
	private int destX;
	int direction;

	
	
	//every fish has a destination
	 
	
	
	
	public Fish(Color color, int x, int y, boolean isLittle, boolean isLeft, int direction) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.isLittle = isLittle;
		this.isLeft = isLeft;
		this.direction = direction;
		
		
		Random destX = new Random();
		Random destY = new Random();
		this.destX = destX.nextInt(500);
		this.destY = destY.nextInt(500);
	}
	public void swim(Graphics2D g) {
		if (this.y < this.destY) {
			this.y +=1;
		}
		if (this.y > this.destY) {
			this.y -=1;
		}
		if (this.x<this.destY){
			this.x +=1;
		}
		if (this.x>this.destY){
			this.x -=1;
		}
		if ((this.x==this.destX)&&(this.y==destY)) {
			Random temp = new Random();
			Random temp2 = new Random();
			
			this.destX = temp.nextInt(500);
			this.destY = temp2.nextInt(500);
		}
	}
	
	public void draw(Graphics2D g) {
		if (this.isLittle) {
			if (this.isLeft) {
				DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
			}
			else {
				DrawFish.smallFacingRight(g, this.color, this.x, this.y);
				}
		}
		else {
			if (this.isLeft) {
				DrawFish.facingLeft(g, this.color, this.x, this.y);
				}
			else {
				DrawFish.facingRight(g, this.color, this.x, this.y);
			}
		}
	}
}
