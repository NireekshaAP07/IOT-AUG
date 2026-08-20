
public class MainThread
{
public static void main(String[] args)
{
	Thread1 ob=new Thread1();
	Thread2 ob1=new Thread2();
	Thread3 ob2=new Thread3();
	ob.start(); //start will call the run().At-a-Time all the run() will start excuting concurrently.
	ob1.start();
	ob2.start();
}
}
