public class TimeCalculation{


	public static void main(String[] args)

	{

	Time time1=new Time();
	Time time2=new Time();	

	time1.setTime(2,10);
	time2.setTime(3,10);

	time1.showTime();
	time2.showTime();
	
	Time time3;
	time3=time1.sum(time2);


	time3.showTime();



	}


}