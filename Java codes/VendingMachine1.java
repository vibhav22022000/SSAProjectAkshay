import java.io.*;
class VendingMachine1
{
	
	public void run()
	{
	
		try
	{
			//MdaStates m = new MdaStates();
			System.out.println("in vm1 try");
		    
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("new buffered reader");
			data tempobj=new temp();
			System.out.println("Created temp data object");
			tempobj.setvm(1);
			System.out.println(tempobj.getvm());
			System.out.println("After setting vm1");
			MDAEFSM m = new MDAEFSM();
			//System.out.println(m);
			data data1obj = new data1();
			String inp=null;
	float temp;
	int no_cups;
	float p,v,x = 0;
	int ch;
	while (true)
	{
	System.out.println("in while");
	
	System.out.println("Select Operation:  \n 0:create 1:coin 2:sugar 3:cappuccino 4:chocolate 5:insert_cups 6:set_price 7:cancel ");
	inp=b.readLine();
	ch=Integer.parseInt(inp);
	
	switch (ch)
	{
		case 0:              //create
				System.out.println("Operation:create");
				System.out.println("Enter the price p:");
				p =Float.parseFloat(b.readLine());
				data1obj.setp(p);
				System.out.println("Price set to :"+p);
				m.create();
				break;
		case 1:  //coin
				
			    System.out.println("Operation: coin");
				System.out.println("Enter value of coin v:");
				v =Float.parseFloat(b.readLine());
				data1obj.setv(v);
				//data dataobj1 = new data1();
				//no_cups = m.getk();
				//tempobj.setv(tempobj.getv() + v);
                //data1obj.setcf(v);
				
			    int cf = data1obj.getcf();
//			    if (cf == 0)
//			    {
//			    	data1obj.setcf(0);	
//			    }	
			    //cf = data1obj.getcf();
			    //System.out.println(cf);
				temp = data1obj.getp();
				System.out.println(temp);
				if((cf + v) < temp)
				{
					m.coin(0);
					System.out.println("Cumulative funds less than the price");
				}
				else if((cf + v) >= temp)
				{
					m.coin(1);
//					int tempcf = data1obj.getcf();
//					System.out.println(tempcf);
					System.out.println("Select drink or additives");
				}
				
//				count++;
				break;
				
		case 2: // sugar
			    System.out.println("Operation: sugar");
			    m.dispose_additive(1);
			    break;
			    
		case 3:	//cappuccino
			    System.out.println("Operation: cappuccino");
			    m.dispose_drink(1);
			    break;
			    
		case 4: //chocolate
			    System.out.println("Operation: chocolate");
		        m.dispose_drink(2);	
		        break;
		        
		case 5://insert cups
			    System.out.println("Operation: insert_cups");
			    System.out.println("Enter the number of cups to be inserted as no_cups:");
				no_cups =Integer.parseInt(b.readLine());
				data1obj.setncups(no_cups);
				System.out.println("No of cups set to :"+no_cups);
			    m.setk(no_cups);
			    m.insert_cups(no_cups);
				break;
				
		case 6://set price
			   System.out.println("Operation: set_price");
			   System.out.println("Enter the new price for p:");
			   p =Float.parseFloat(b.readLine());
			   data1obj.setp(p);
			   System.out.println("Price set to :"+p);
			   m.set_price();
			   break;
			   
		case 7:// cancel
			   System.out.println("Operation: cancel");
			   m.cancel();
			   break;
			   
		case 8:  //card
			
		    	System.out.println("Operation: card");
		    	System.out.println("Enter value of card x:");
		    	v =Float.parseFloat(b.readLine());
		    	data1obj.setx(x);
		    	int cf9 = data1obj.getcf();
		    	temp = data1obj.getx();
		    	System.out.println(temp);
		    	if((cf9 + v) < temp)
		    	{
		    		m.coin(0);
		    		System.out.println("Cumulative funds less than the price");
		    	}
		    	else if((cf9 + v) >= temp)
		    	{
		    		m.coin(1);
		    		System.out.println("Select drink or additives");
		    	}
		    	break;
			   
		
			   
		default:
			    System.out.println("Invalid choice!!!");
			    break;
			   }
	}
}
	catch(Exception e)
{
   System.out.println("Exception e:" +e);	
}
	
}
}
