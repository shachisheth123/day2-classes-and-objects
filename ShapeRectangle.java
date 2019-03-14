public class ShapeRectangle
{

	private double length;
	private double breadth;

	public ShapeRectangle(double length , double breadth)
	{
	this.length=length;
	this.breadth=breadth;
	}

	public double area()
	{
	return length*breadth;
	}

	public double perimeter()
	{

	return 2*(length+breadth);

	}
	public void compareAreaa(ShapeRectangle rectangle1 ,ShapeRectangle rectangle2)
	{

	if(rectangle1.area()==rectangle2.area())
	
		System.out.println("areas are same");
	
	else 
		System.out.println("areas are not same");
	}


}