package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class Bubbles {
	int x;
	int y;
	int size;
	int counter;
	
	public Bubbles (int x, int y) {
		this.x = x;
		this.y = y;
		Random size = new Random();
		Random counter = new Random();
		this.counter = counter.nextInt(50);
		this.size = size.nextInt(50);
	}
	public void draw(Graphics2D g) {
		Shape bubble = new Ellipse2D.Double(this.x, this.y, this.size, this.size);
		g.setColor(Color.WHITE);
		g.fill(bubble);
		g.draw(bubble);
		
		Shape coversquare = new Rectangle2D.Double(380, 400, 100, 150);
		Shape treasure = new Rectangle2D.Double(380, 400, 100, 150);
		g.setColor(Color.blue);
		g.fill(coversquare);
		g.draw(coversquare);
		
		g.setColor(Color.yellow);
		g.fill(treasure);
		g.draw(treasure);
		
	}
	
	public void swim(Graphics2D g) {
		this.y -=1;
		if (this.counter<25) {
			this.x -=1;
			this.counter +=1;
		}
		else {
			this.x +=1;
			this.counter +=1;
			if (this.counter>50) {
				this.counter = 0;
				this.x -=1;
			if (this.y < (-50)) {
				this.y = 500;
			}
			}	
		}
	}
}
