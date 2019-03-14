class Rectangle
{

	public static void main(String[] args)
	{

	ShapeRectangle rectangle1=new ShapeRectangle(10.5,25.0);
	ShapeRectangle rectangle2=new ShapeRectangle(20.5,35.0);
	ShapeRectangle rectangle3=new ShapeRectangle(30.5,45.0);
	rectangle1.area();
	rectangle1.perimeter();

	rectangle2.area();
	rectangle2.perimeter();
	rectangle1.compareAreaa(rectangle2,rectangle3);
	
	}


}