public class TelevisionMain
{


	public static void main(String[] args )
	{
	
	Television tv = new Television(16 , "Sony" , false);
	
	System.out.println("Volume is" +tv.increaseDecreaseVolume());
	System.out.println("channel is" +tv.changeChannel());
	tv.state();
	tv.volume();

	}
}