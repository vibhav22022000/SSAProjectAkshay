import java.io.BufferedReader;
import java.io.InputStreamReader;

class VendingMachine2
{
	
	public void run()
	{
	
		try
	{
			//MdaStates m = new MdaStates();
			System.out.println("in vm2 try");
		    
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			//System.out.println("new buffered reader");
			data tempobj=new temp();
			//System.out.println("Created temp data object");
			tempobj.setvm(2);
			System.out.println(tempobj.getvm());
			System.out.println("After setting vm2");
			MDAEFSM m = new MDAEFSM();
			//System.out.println(m);
			data data2obj = new data2();
			String inp=null;
	int p,v;
	int no_cups;
	int ch;
	while (true)
	{
	//System.out.println("in while");
	
	System.out.println("Select Operation:  \n 0:CREATE 1:COIN 2:SUGAR 3:CREAM 4:COFFEE 5:InsertCups 6:SetPrice 7:CANCEL ");
	inp=b.readLine();
	ch=Integer.parseInt(inp);
	
	switch (ch)
	{
		case 0:              //create
				System.out.println("Operation: CREATE");
				System.out.println("Enter the price p:");
				String price = b.readLine();
				p = (int) Integer.valueOf(price.trim()).floatValue();
				data2obj.setp(p);
				System.out.println("Price set to :"+p);
				m.create();
				break;
		case 1:  //coin
				
			    System.out.println("Operation: COIN");
				System.out.println("Enter value of coin v:");
				String val = b.readLine();
				v = (int) Integer.valueOf(val.trim()).floatValue();
				data2obj.setv(v);
				//data dataobj1 = new data1();
				//no_cups = m.getk();
				//tempobj.setv(tempobj.getv() + v);
                //data1obj.setcf(v);
				
			    float cf = data2obj.getvm2cf();
//			    if (cf == 0)
//			    {
//			    	data1obj.setcf(0);	
//			    }	
			    //cf = data1obj.getcf();
			    //System.out.println(cf);
				float temp1 = data2obj.getvm2p();
				System.out.println(temp1);
				if((cf + v) < temp1)
				{
					m.coin(0);
					System.out.println("Cumulative funds less than the price");
				}
				else if((cf + v) >= temp1)
				{
					m.coin(1);
//					int tempcf = data1obj.getcf();
//					System.out.println(tempcf);
					System.out.println("Select drink or additives");
				}
				
//				count++;
				break;
				
		case 2: // sugar
			    System.out.println("Operation: SUGAR");
			    m.dispose_additive(1);
			    break;
			    
		case 3:	//cream
			    System.out.println("Operation: CREAM");
			    m.dispose_additive(2);
			    break;
			    
		case 4: //coffee
			    System.out.println("Operation: COFFEE");
		        m.dispose_drink(1);	
		        break;
		        
		case 5://insert cups
			    System.out.println("Operation: InsertCups");
			    System.out.println("Enter the number of cups to be inserted as no_cups:");
				no_cups =Integer.parseInt(b.readLine());
				data2obj.setncups(no_cups);
				System.out.println("No of cups set to :"+no_cups);
			    m.setk(no_cups);
			    m.insert_cups(no_cups);
				break;
				
		case 6://set price
			   System.out.println("Operation: SetPrice");
			   System.out.println("Enter the new price for p:");
			   String price1 = b.readLine();
			   p = (int) Float.valueOf(price1.trim()).floatValue();
			   data2obj.setp(p);
			   System.out.println("Price set to :"+p);
			   m.set_price();
			   break;
			   
		case 7:// cancel
			   System.out.println("Operation: cancel");
			   m.cancel();
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
