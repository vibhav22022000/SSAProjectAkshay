
public class COFFEE extends DisposeDrink {

	@Override
	public void disposeDrink(int d) 
	{
		data db2obj = new data2();
		if (d==1)
		{
			db2obj.setDrinkList1(1);
			String Coffee = db2obj.getDrinkList1();
			String Additive = db2obj.getAdditiveList1();
			//String Cream = db2obj.getAdditiveList1();
			System.out.println(Additive);
			if (Additive.equals("SUGAR"))
			System.out.println("Disposed Drink is: " +Coffee+ " with " +Additive);
			else if (Additive.equals("CREAM"))
			System.out.println("Disposed Drink is: " +Coffee+ " with " +Additive);
			else
			System.out.println("Disposed Drink is: " +Coffee);
			
			
			
		}

	}

}
