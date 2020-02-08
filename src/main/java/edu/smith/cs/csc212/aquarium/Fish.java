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
	 
	
	
	
	public Fish(Color color, int x, int y, boolean isLittle, int direction) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.isLittle = isLittle;
		this.direction = direction;
		
		Random destX = new Random();
		Random destY = new Random();
		this.destX = destX.nextInt(500);
		this.destY = destY.nextInt(500);
		
		//CHeck = System.out.println("check point one" + ' '+ this.x + ' ' + this.y + ' ' + this.destX + ' ' + this.destY);
		
		if (this.destX > x) {
			this.isLeft = false;
		}
		else {
			this.isLeft = true;
		}
	}
	public void swim(Graphics2D g) {
		if (this.y < this.destY) {
			this.y +=1;
		}
		if (this.y > this.destY) {
			this.y -=1;
		}
		if (this.x < this.destX){
			this.x +=1;
		}
		if (this.x > this.destX){
			this.x -=1;
		}
		if ((this.x==this.destX)&&(this.y==this.destY)) {
			Random temp = new Random();
			Random temp2 = new Random();
			
			this.destX = temp.nextInt(500);
			this.destY = temp2.nextInt(500);
			
			if (this.destX > x) {
				this.isLeft = false;
			}
			else {
				this.isLeft = true;
			}
		
			
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
