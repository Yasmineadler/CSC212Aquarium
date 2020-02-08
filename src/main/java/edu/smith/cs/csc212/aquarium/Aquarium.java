package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

import me.jjfoley.gfx.GFX;

/**
 * Aquarium is a graphical "application" that uses some code I built and have
 * shared with you that takes care of opening a window and communicating with
 * the user in a simple way.
 * 
 * The method draw is called 50 times per second, so we make an animation by
 * drawing our fish in one place, and moving that place slightly. The next time
 * draw gets called, our fish looks like it moved!
 * 
 * @author jfoley
 *
 */

public class Aquarium extends GFX {
	/**
	 * This is a static variable that tells us how wide the aquarium is.
	 */
	public static int WIDTH = 500;
	/**
	 * This is a static variable that tells us how tall the aquarium is.
	 */
	public static int HEIGHT = 500;

	/**
	 * Put a snail on the top of the tank.
	 */
	Snail algorithm = new Snail(177, Snail.HEIGHT + 1, "top");
	
	/**
	 * This is a constructor, code that runs when we make a new Aquarium.
	 */
	public Aquarium() {
		// Here we ask GFX to make our window of size WIDTH and HEIGHT.
		// Don't change this here, edit the variables instead.
		super(WIDTH, HEIGHT);
		
	}
	
	
	
	Bubbles one = new Bubbles(400, 100 );
	Bubbles two = new Bubbles(420, 220 );
	Bubbles three = new Bubbles(400, 300);
	Bubbles four = new Bubbles(410, 350 );
	Bubbles five = new Bubbles(400, 470 );
	Bubbles six = new Bubbles(430, 550 );
	Bubbles seven = new Bubbles(410, 600 );
	Bubbles eight = new Bubbles(400, 730);
	Bubbles nine = new Bubbles(440, 750 );
	Bubbles ten = new Bubbles(425, 800);

	Fish nemo = new Fish(Color.MAGENTA, 250, 250, true, 1);
	Fish marlin = new Fish(Color.GREEN, 100, 400, false, -1);
	Fish newguy = new Fish(Color.RED, 150, 300, false, 1);
	Fish guppy = new Fish(Color.yellow, 300, 150, true, -1);
	
	public double green = 0;
	
	@Override
	public void draw(Graphics2D g) {
		// Draw the "ocean" background.
		int greenvalue;
		greenvalue = (int) Math.round(green);
		Color color = new Color(51, greenvalue , 255);
		g.setColor(color);
		g.fillRect(0, 0, getWidth(), getHeight());
		// Draw the fish
		
		one.swim(g);
		two.draw(g);
		two.swim(g);
		three.draw(g);
		three.swim(g);
		four.draw(g);
		four.swim(g);
		five.draw(g);
		five.swim(g);
		six.draw(g);
		six.swim(g);
		seven.draw(g);
		seven.swim(g);
		eight.draw(g);
		eight.swim(g);
		nine.draw(g);
		nine.swim(g);
		ten.draw(g);
		ten.swim(g);
		
		nemo.draw(g);
		nemo.swim(g);
		marlin.draw(g);
		marlin.swim(g);
		newguy.draw(g);
		newguy.swim(g);
		guppy.draw(g);
		guppy.swim(g);
		
		algorithm.draw(g, green);
		
	}

	public static void main(String[] args) {
		// Uncomment this to make it go slower!
		// GFX.FPS = 10;
		// This is potentially helpful for debugging movement if there are too many print statements!

		// Note that we can store an Aquarium in a variable of type GFX because Aquarium
		// is a very specific GFX, much like 7 can be stored in a variable of type int!
		GFX app = new Aquarium();
		app.start();
	}

}
