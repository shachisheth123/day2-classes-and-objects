public class Distance
{

public static void main(String[] args)

	{

	DistanceCalculation dist = new DistanceCalculation();
	DistanceCalculation dist1 = new DistanceCalculation();

	dist.set(10,20.5);
	dist1.set(20,30.5);
	
	dist.displayDistance();
	dist1.displayDistance();

	DistanceCalculation dc;
	dc=dist.add(dist1);
		
	dc.displayDistance();
	
	}

}