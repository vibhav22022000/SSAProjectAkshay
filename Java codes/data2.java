
class data2 extends data 
{
	static int p,v,no_cups = 0,cumulative_cups,vmno;
	static int cf;
	static int[] additiveList1 = new int[2];
	static int [] drinkList1 = new int[1];
	
	public void setp(int a)
	{p=a;}
    public void setv(int b)
	{v=b;}
    public void setncups(int c)
	{
    	if (no_cups == 0)
    	{
    	no_cups=c;
    	cumulative_cups = c;
    	}
    	else
    	{
    	no_cups	= c;
    	cumulative_cups+=c;
    	}
    	
    	}
    public int getvm2p()
	{return p;}
    public int getvm2v()
	{return v;}
    public int getncups()
	{return cumulative_cups;}
    public void setcf(int d)
    {
    	cf =d;
    }
    public int getvm2cf()
    {
    	return cf;
    }
    public void settotalcups(int e)
    {
    	cumulative_cups = e;
    }
    public int gettotalcups()
    {
    	return cumulative_cups;
    }
    
    public void setAdditiveList1(int a)
	{
		if(a == 1)
		{
			additiveList1[0] = 1;
		}
		
		if (a == 2)
		{
			additiveList1[1] = 1;
		}
	}
    
    public void setDrinkList1(int d)
	{
		if(d==1)
		{
			drinkList1[0] = 1;
		}
		
	}
    
    public String getAdditiveList1()
	{
		
		if (additiveList1[0] == 1)
		{
			additiveList1[0] = 0;
			return "SUGAR";
		}
		
		if (additiveList1[1] == 1)
		{
			additiveList1[1] = 0;
			return "CREAM";
		}
		return "No Sugar or Cream ";
	}
    
    public String getDrinkList1()
	{
    	if (drinkList1[0] == 1)
		{
    		drinkList1[0] = 0;
    		return "COFFEE";
			
		}
    	else
    	return null;
	}
    
    public void setvm(int d)
    {
    	vmno=d;
    }
    public int getvm()
    {
    	return vmno;
    }
}
