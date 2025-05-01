
public class NoCups extends VMState {
	
	public void coin(int f)
	{
		
		opObj.ReturnCoins();
	}
	
	public void insert_cups(int n)
	{
		data data1obj = new data1();
		data1obj.setncups(n);
		opObj.ResetCF();
	}

}
