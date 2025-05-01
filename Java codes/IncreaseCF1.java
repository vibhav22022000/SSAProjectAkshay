
public class IncreaseCF1 extends IncreaseCF {

	@Override
	public void increaseCF() 
	{
		// TODO Auto-generated method stub
		data tempobj = new data1();
		float val = tempobj.getv();
		float cf = tempobj.getcf();
		cf = cf + val;
		tempobj.setcf(cf);
		System.out.println("Cumulative funds are:" +cf);
		
		
		

	}

}
