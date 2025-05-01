
class concretefactory1 extends abstractFactory
{
    	
	public StorePrice getStoredPrice()
	{
	    StorePrice sp = new StorePrice1();
	    return sp;
	}
	
	public IncreaseCF getIncreasedCF()
	{
		IncreaseCF inc = new IncreaseCF1();
		return inc;
	}
	
	public ResetCF getResetCF()
	{
		ResetCF rcf = new ResetCF1();
		return rcf;
	}
	
	public ReturnCoins getReturnedCoins()
	{
		ReturnCoins rc = new ReturnCoins1();
		return rc;
	}
	public DisposeDrink getDisposedDrink(int d)
	{
		if (d==1)
		{
			DisposeDrink dt = new Cappuccino();
			return dt;
		}
		else if (d==2)
		{
			DisposeDrink dc = new Chocolate();
			return dc;	
		}
		else
		return null;
	}
	
	
	@Override
	public DisposeAdditive getDisposedAdditive(int a) 
	{
		// TODO Auto-generated method stub
		if (a==1)
		{
			//System.out.println("a" +a);
			DisposeAdditive ds = new Sugar();
			return ds;
		}
		else
		return null;
	}
	
	public IncreaseCups getIncreasedCups()
	{
		IncreaseCups incCup = new IncreaseCups1();
		return incCup;
	}
	
	
	
}
