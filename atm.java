import java.util.*;

class atm
{
//public void checkbalance()

	public static void main(String[] args)
	{
		float balance=10000;
		int PIN=1236;
		System.out.println("Enter your pin:");
		Scanner sc = new Scanner(System.in);
		int enteredpin = sc.nextInt();
		
		
		
			if(enteredpin==PIN)
			{
				//do()
				//{
					
						System.out.println("Welcome :");
						//main();
						System.out.println("1. Check your History");
						System.out.println("2. Withdraw ");
						System.out.println("3. Deposit");
						System.out.println("4. Transfer");
						System.out.println("5. Quit");
						
						Scanner cs = new Scanner(System.in);
						int choice = cs.nextInt();
						
					
					
					if(choice==1)
					{
							System.out.println("Current Balance is:" +balance);
							System.out.println("Select your choice furture:1-Tranfered Money and 2-Recived Money");
							Scanner mn = new Scanner(System.in);
							int money = mn.nextInt();
							if(money==1)
							{
							System.out.println("Tranfered Moneys from:");
							System.out.println("2000 to Josh Marline");
							System.out.println("102 to cake shop");
							System.out.println("500 to Canteen");
							}
							else if(money==2)
							{
							System.out.println("Recived Moneys to:");
							System.out.println("5000 from David");
							System.out.println("102 from john");
							System.out.println("500 from kevin");
							}
					}
					else if(choice==2)
					{
						System.out.println("Enter Amount to withdraw:");
						Scanner wd = new Scanner(System.in);
						int wid = wd.nextInt();
						
						System.out.println("You withdraw:" +wid);
						balance=balance-wid;
						System.out.println("Current balance is now:" +balance);
						
					}
					else if(choice==3)
					{
						System.out.println("Enter Amount to Deposit:");
						Scanner dp = new Scanner(System.in);
						int dip = dp.nextInt();
						
						System.out.println("You Diposit:" +dip);
						balance=balance+dip;
						System.out.println("Current balance is now:" +balance);
					}
					else if(choice==4)
					{
						System.out.println("Enter Amount to Trasfer:");
						Scanner tf = new Scanner(System.in);
						int tra = tf.nextInt();
						
						System.out.print("Enter Account Number to whome You want to Transfer:");
						Scanner acc = new Scanner(System.in);
						int acn = acc.nextInt();
						System.out.println("You Trasfer:"  +tra+  "to" +acn);
						
						balance=balance-tra;
						System.out.println("Current balance is now:" +balance);
					}
					else if(choice==5)
					{
						System.out.println("Have a Good Day!!!");
					}
					else{
						System.out.println("Enter valid choice:");
					}
				//}while(choice!=5);
			}
			else
			{
				System.out.println("Enter valid pin");
			}
			
	
	}
}
