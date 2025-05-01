//import java.lang.*; 
import java.io.*; 
public class Main
{
	public static void main(String args[])
	{
		try{
				System.out.println("Please Select Vending Machine : \n 1: VM1 \n 2: VM2");
				BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
				int ch=Integer.parseInt(b.readLine());
				switch (ch)
				{
					case 1: 
						System.out.println("Vending Machine 1"); 
						VendingMachine1 vm1=new VendingMachine1(); 
						vm1.run();
						break;
					case 2: 
						System.out.println("Vending Machine 2");  
						VendingMachine2 vm2=new VendingMachine2(); 
						vm2.run();
						break;
					default: System.out.println("Wrong Choice/Please Select Again");
					    break;
				}
		}
	catch(Exception e){}
	}
}