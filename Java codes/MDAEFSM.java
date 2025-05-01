
class MDAEFSM 
{
	static int state=0;  ////state : 0=start 1=no cups 2=idle 3=coins inserted
	private int k = 0;
	VMState idleObj = new Idle();
	VMState start = new Start();
	VMState noCups = new NoCups(); 
	VMState coinsInserted = new CoinsInserted();
	
	VMState stateObj=new VMState();
	
	
	public void create()
	{
		if(state == 0)
		{
			start.create();
			state = 1;
		}
	}
	
	public void coin(int f)
	{
		if(state == 1)
		{
			noCups.coin(f);
		}
		else if(state == 2)
		{
			if(f == 0)
			{
				idleObj.coin(f);
			}
			else if(f == 1)
			{
				idleObj.coin(f);
				state = 3;
			}
		}
		else if(state == 3)
		{
			coinsInserted.coin(f);
		}
	}
	
	public void card(float x)
	{
		if(state == 1)
		{
			noCups.card(x);
		}
		else if(state == 2)
		{
			if(x == 0)
			{
				idleObj.card(x);
			}
			else if(x == 1)
			{
				idleObj.card(x);
				state = 3;
			}
		}
		else if(state == 3)
		{
			coinsInserted.card(x);
		}
	}
	
	public void insert_cups(int n)
	{
		if(state == 1)
		{
			if(n>0)
			{
				noCups.insert_cups(n);
				state = 2;
			}
		}
		else if (state == 2)
		{
			if(n>0)
			{
				idleObj.insert_cups(n);
			}
		}
	}
	
	public void set_price()
	{
		if(state == 2)
		{
			idleObj.set_price();
		}
	}
	
	public void dispose_drink(int d)
	{
		if(state == 3)
		{
			if(k>1)
			{
				coinsInserted.dispose_drink(d);
				state = 2;
			}
			else if(k<=1)
			{
				coinsInserted.dispose_drink(d);
				state = 1;
			}
		}
	}
	
	public void dispose_additive(int a)
	{
		if(state == 3)
		{
			System.out.println("in coins inserted" +a);
			coinsInserted.dispose_additive(a);
			//System.out.println();
		}
	}

	public void cancel()
	{
		if(state == 3)
		{
			coinsInserted.cancel();
			state = 2;
		}
	}
	
	
	
	public void setk(int z)
	{
		k = z;
	}
	
	public int getk()
	{
		return k;
	}

}
