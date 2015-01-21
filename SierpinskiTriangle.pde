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