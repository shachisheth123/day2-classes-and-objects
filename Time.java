public class Time
{

	int hours;
	int minutes;
	
	public void setTime(int hours,int minutes)
	{

	this.hours=hours;
	this.minutes=minutes;

	}


	public void showTime()
	{
	System.out.println("The time is" +hours +" " +minutes);
	}


	public Time sum(Time time1)
	{
	Time time2=new Time();
	time1.hours=this.hours+time2.hours;
	time1.minutes=this.minutes+time2.minutes;
	return time1;
	
	}
}