abstract class abstractFactory 

{
	
	public abstract StorePrice getStoredPrice();
	public abstract IncreaseCF getIncreasedCF();
	public abstract ResetCF getResetCF();
	public abstract ReturnCoins getReturnedCoins();
	public abstract DisposeDrink getDisposedDrink(int d);
	public abstract DisposeAdditive getDisposedAdditive(int a);
    public abstract IncreaseCups getIncreasedCups(); 
	
	// add for additive
}
