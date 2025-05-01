
public class Sugar extends DisposeAdditive 
{

	@Override
	public void disposeAdditive(int a) 
	{
		// TODO Auto-generated method stub
		System.out.println("in additive");
		data db1obj = new data1();
		data db2obj = new data2();
		if (a==1)
		{
			db1obj.setAdditiveList1(1);
			db2obj.setAdditiveList1(1);
			//System.out.println("additive");
			//String Sugar = db1obj.getAdditiveList1();
			//System.out.println("Disposed Additive is: " +Sugar );
		}

	}

}
