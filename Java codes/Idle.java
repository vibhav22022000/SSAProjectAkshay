
public class Idle extends VMState 
{
	OutputProcessor opObj=new OutputProcessor();
	
	public void insert_cups(int n)
	{
		
		opObj.IncreaseCups(n);
	}
	
	public void coin(int f)
	{
		
	     if (f == 0)
	    {
	    	 opObj.IncreaseCF();
	    }
	    else if(f == 1)
		{
			opObj.IncreaseCF();
			System.out.println("Additive reset");
			
		}
	}
	
	public void set_price()
	{
		opObj.StorePrice();
	}
	

}
