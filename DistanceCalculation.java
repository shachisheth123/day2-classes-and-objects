public class DistanceCalculation
{

	int feet;
	double inches;
		
	public void set(int feet,double inches)
	{
	this.feet=feet;
	this.inches=inches;
	}

	public void displayDistance()
	{
	
	System.out.println(feet +" " +inches );	

	}

	public DistanceCalculation add(DistanceCalculation d)
	{
	     
	DistanceCalculation distance1=new DistanceCalculation();
	distance1.feet=this.feet+d.feet;
	distance1.inches=this.inches+d.inches;
 	return distance1;

	}


}