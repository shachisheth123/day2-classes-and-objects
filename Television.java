public class Television
{
	int volume;
	String channel;
	Boolean state;
	Television(int volume,String channel,Boolean state)
	{
		this.volume=volume;
		this.channel=channel;
		this.state=state;
	}

	public void state()
	{
		
		Boolean b=false;
		if(state!=b)
		{
			System.out.println("Television turned off" );
		}

		this.state=state;
	}


	public int increaseDecreaseVolume()
	{
		System.out.println("current volume of tv is" +this.volume);
		if((this.state)==true)
		
			volume=volume+1;
		else
			volume=volume-1;	

		//this.volume=volume;
		return volume;
	}

	public void volume()
	{
			
		System.out.println("The changed volume of TV is" +volume );
		System.out.println("The changed channel is" +channel );
		
	}

	public String changeChannel()
	{
		
			if((this.state)==true)
		
			channel=channel+1;
		else
			channel=channel-1;	

		//this.volume=volume;
		return channel;
		
	}


}