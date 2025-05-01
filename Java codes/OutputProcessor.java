
public class OutputProcessor {
	
	data tempObj=new temp();
	data data1obj = new data1();
	data data2obj = new data2();
	abstractFactory conFac1 = new concretefactory1();
	abstractFactory conFac2 = new concretefactory2();
	
	public void StorePrice()
	{
		StorePrice stObj;
		float p = data1obj.getp();
		float price = data2obj.getvm2p();
		
		int machineNum = tempObj.getvm();
		if(machineNum == 1)
		{
			stObj = conFac1.getStoredPrice(); 
			stObj.storePrice(p);
		}
		if(machineNum == 2)
		{
			stObj = conFac2.getStoredPrice(); 
			stObj.storePrice(price);
		}
		
		
	}
	
	public void ResetCF()
	{
		ResetCF reCF;
		
		int machineNum = tempObj.getvm();
		if(machineNum == 1)
		{
			reCF = conFac1.getResetCF(); 
			reCF.resetCF();
		}
		if(machineNum == 2)
		{
			reCF = conFac2.getResetCF();
			reCF.resetCF();
		}
		
		
	}
	
	public void IncreaseCF()
	{
		IncreaseCF incCF;
		
		int machineNum = tempObj.getvm();
		if(machineNum == 1)
		{
			incCF = conFac1.getIncreasedCF(); 
			incCF.increaseCF();
		}
		if(machineNum == 2)
		{
			incCF = conFac2.getIncreasedCF();
			incCF.increaseCF();
		}
		
	}
	
	public void ReturnCoins()
	{
		ReturnCoins retCoins;
		int machineNum = tempObj.getvm();
		if(machineNum == 1)
		{
			retCoins = conFac1.getReturnedCoins(); 
			retCoins.returnCoins();
		}
		if(machineNum == 2)
		{
			retCoins = conFac2.getReturnedCoins();
			retCoins.returnCoins();
		}
		
	}
	
	public void DisposeDrink(int d)
	{
		DisposeDrink disDrink;
		
		int machineNum = tempObj.getvm();
		if(machineNum == 1)
		{
			disDrink = conFac1.getDisposedDrink(d); 
			disDrink.disposeDrink(d);
		}
		if(machineNum == 2)
		{
			disDrink = conFac2.getDisposedDrink(d);
			disDrink.disposeDrink(d);
		}
		
	}
	
	// for additive and if initializing of additive list reqd.
	
	public void DisposeAdditive(int d)
	{
		DisposeAdditive disAdditive;
		
		int machineNum = tempObj.getvm();
		System.out.println(tempObj.getvm());
		if(machineNum == 1)
		{
			disAdditive = conFac1.getDisposedAdditive(d); 
			disAdditive.disposeAdditive(d);
		}
		if(machineNum == 2)
		{
			disAdditive = conFac2.getDisposedAdditive(d); 
			disAdditive.disposeAdditive(d);
		}
		
	}
	
	public void IncreaseCups(int n)
	{
		IncreaseCups inccup;
		
		int machineNum = tempObj.getvm();
		System.out.println(tempObj.getvm());
		if(machineNum == 1)
		{
			inccup = conFac1.getIncreasedCups(); 
			inccup.increaseCups(n);
		}
		if(machineNum == 2)
		{
			inccup = conFac2.getIncreasedCups(); 
			inccup.increaseCups(n);
		}
		
	}

	
	

}
