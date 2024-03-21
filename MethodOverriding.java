class Shape
{
	void draw()
	{
		System.out.println("Draw a shape");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Square Shape");
	}
}
class Methodoverriding
{
	public static void main(String[] args) {
		Shape r=new Square();
		r.draw();
	}
}