package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	public void setup() {
		size(600,400);
		background(255,220,0);
	}
	
	public void draw() {
		fill(0,0,0);
		ellipse(50,50,50,50);
		
		fill(0,0,0);
		ellipse(550,50,50,50);
		
	}
}
