
class concretefactory2 extends abstractFactory 
{

	@Override
	public StorePrice getStoredPrice() 
	{
		StorePrice sp = new StorePrice2();
	    return sp;
	}

	@Override
	public IncreaseCF getIncreasedCF() 
	{
		IncreaseCF inc = new IncreaseCF2();
		return inc;
	}

	@Override
	public ResetCF getResetCF() 
	{
		ResetCF rcf = new ResetCF2();
		return rcf;
	}

	@Override
	public ReturnCoins getReturnedCoins() 
	{
		ReturnCoins rc = new ReturnCoins2();
		return rc;
	}

	
	

	@Override
	public DisposeAdditive getDisposedAdditive(int a) 
	{
		if (a==1)
		{
			DisposeAdditive ds = new Sugar();
			return ds;
		}
		else if (a==2)
		{
			DisposeAdditive dc = new CREAM();
			return dc;	
		}
		else
		return null;
	}

	@Override
	public DisposeDrink getDisposedDrink (int d) 
	{
		// TODO Auto-generated method stub
		if (d==1)
		{
			DisposeDrink dt = new COFFEE();
			return dt;
		}
	   else
	   return null;
	}

	@Override
	public IncreaseCups getIncreasedCups() 
	{
		IncreaseCups incCup = new IncreaseCups2();
		return incCup;
	}

	
	

	
}
