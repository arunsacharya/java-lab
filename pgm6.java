/* 6. Consider a scenario similar to Producer/Consumer problem in day to day life where son is studying engineering in other state, for his expenditure father will be depositing some money to his account every month. Father will wait until his son notifies him to deposit money else son will wait until he spends available amount in the account. In this example depositing (put) and withdrawing (get) is considered as synchronized method executed by father and son on a shared account. */

package lab_programs;

class Q
 {
	int Balance_Amount;
	boolean valueSet = false;
	private String num;
     
	synchronized int get()
	{
		while(!valueSet)
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("InterruptedException caught..!!");
			}
			System.out.println("Got : " + num);
			valueSet = false;
			notify();
			return Balance_Amount;
	}
     
	synchronized void put(int amount)
	{
		while(valueSet)
			try
			{                
				wait();	
			}	
			catch(InterruptedException e)
            {
				System.out.println("InterruptedException caught..!!");
            }
			Balance_Amount = amount;
            valueSet = true;
            System.out.println("Put : " + Balance_Amount);
            notify();
     }
 }
 
class Producer implements Runnable
{
	Q que;
	Producer(Q que)
	{
		this.que = que;
		new Thread(this, "Producer").start();
	}
     
	public void run()
	{
		int amount = 10000;
		while(true)
		{
			que.put(amount);
		}
	}
}

class Consumer implements Runnable
{
	Q que;
	Consumer(Q que)
	{
		this.que = que;
		new Thread(this, "Consumer").start();
	}
    
	public void run()
	{
		while(true)
		{
			que.get();
		}
	}
}

class pgm6
{
	public static void main(String args[])
	{
		Q que = new Q();
		new Producer(que);
		new Consumer(que);
		System.out.println("Press Control-C to stop...");   
	}
}
