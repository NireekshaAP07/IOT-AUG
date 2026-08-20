package Thrusday;
import java.util.*;
public class ErrorExample 
{
public static void main(String[] args) 
{
	try
	{
Scanner ob=new Scanner(System.in);
System.out.println("Enter 2 nos");
int a=ob.nextInt();
int b=ob.nextInt();
int c=a/b;
System.out.println("The result is "+c);
	}
	catch(Exception ae)
	{
		System.out.println("the error is "+ae);
	}
System.out.println("The end of the program");
}
}
