
public class CoinsInserted extends VMState{
	
	public void coin(int f)
	{
		opObj.ReturnCoins();
	}
	
    public void dispose_additive(int a)
	{
		System.out.println("in dispose_additive" +a);
    	opObj.DisposeAdditive(a);
		
	}
	
	public void dispose_drink(int d)
	{
		data data1obj = new data1();
		data data2obj = new data2();
		int k = data1obj.getncups();
		k = k - 1;
		if(k > 1)
		{
			data1obj.setncups(k);
			data2obj.setncups(k);
			opObj.ResetCF();
		}
		opObj.DisposeDrink(d);

		
	}
	
	public void cancel()
	{
		opObj.ReturnCoins();
		opObj.ResetCF();
	}

}
