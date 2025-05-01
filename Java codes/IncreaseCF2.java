
public class IncreaseCF2 extends IncreaseCF {

	@Override
	public void increaseCF() 
	{
		data tempobj = new data2();
		int val = tempobj.getvm2v();
		int cf = tempobj.getvm2cf();
		cf = cf + val;
		tempobj.setcf(cf);
		System.out.println("Cumulative funds are:" +cf);

	}

}
