
public class Chocolate extends DisposeDrink {

	@Override
	public void disposeDrink(int d) 
	{
		// TODO Auto-generated method stub
		data db1obj = new data1();
		if (d==2)
		{
			db1obj.setDrinkList1(2);
			String Chocolate = db1obj.getDrinkList1();
			
			String Sugar = db1obj.getAdditiveList1();
			if (Sugar.equals("Sugar"))
			System.out.println("Disposed Drink is: " +Chocolate+  " with "  +Sugar);
			else
		    System.out.println("Disposed Drink is: " +Chocolate );
			
		}

	}

}
