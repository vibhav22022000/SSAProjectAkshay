
class data1 extends data 

{
	static int no_cups = 0,cf,cumulative_cups,vmno;
	static float p,v,x;
	static int[] additiveList1 = new int[1];
	static int [] drinkList1 = new int[2];
	
	public void setp(float a)
	{p=a;}
    public void setv(float b)
	{v=b;}
    public void setx(float x)
	{x=x;}
    
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
    public float getp()
	{return p;}
    public float getv()
	{return v;}
    public float getx()
	{return x;}
    public int getncups()
	{return cumulative_cups;}
    public void setcf(int d)
    {
    	cf =d;
    }
    public int getcf()
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
	}
    
    public void setDrinkList1(int d)
	{
		if(d==1)
		{
			drinkList1[0] = 1;
		}
		else if (d==2)
		{
			drinkList1[1] = 1;
		}
	}
    
    public String getAdditiveList1()
	{
		
		if (additiveList1[0] == 1)
		{
			additiveList1[0] = 0;
			return "Sugar";
		}
		else
	    return "No Sugar";
	}
    
    public String getDrinkList1()
	{
    	if (drinkList1[0] == 1)
		{
    		drinkList1[0] = 0;
    		return "Cappuccino";
			
		}
    	
    	else if (drinkList1[1] == 1)
		{
    		drinkList1[1] = 0;
    		return "Chocolate";
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

