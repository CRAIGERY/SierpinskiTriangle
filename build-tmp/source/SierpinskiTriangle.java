import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SierpinskiTriangle extends PApplet {

public void setup()
{
	size(500,500);
	background(0);
}
public void draw()
{
	freakinGeometry(0, 500, 500);
}
public void freakinGeometry(int x, int y, int len) 
{
	if(len <= 20)
	{
		fill(255);
		triangle(x ,y, x + len, y, x + len/2, y - len);
	}
	else
	{
		freakinGeometry(x ,y , len/2);
		freakinGeometry(x + len/2, y, len/2);
		freakinGeometry(x + len/4, y - len/2, len/2);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SierpinskiTriangle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
