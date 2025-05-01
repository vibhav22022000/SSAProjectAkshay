
public class ResetCF2 extends ResetCF 
{

	@Override
	public void resetCF() 
	{
		data data2obj = new data2();
		data2obj.setcf(0);
		System.out.println("CF reset to:" +data2obj.getcf());
	}

}
