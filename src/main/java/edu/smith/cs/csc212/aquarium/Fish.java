package edu.smith.cs.csc212.aquarium;

import java.awt.Color;

import java.awt.Graphics2D;

public class Fish {
	int x;
	int y;
	Color color;
	
	public Fish(Color color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}
	public void swim(Graphics2D g) {
		this.x -= 1;
	}
	
	public void draw(Graphics2D g) {
		DrawFish.facingRight(g, this.color, this.x, this.y);
	}
}
