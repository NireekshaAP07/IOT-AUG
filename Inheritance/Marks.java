

package Tuesday;
import java.util.*;
public class Marks extends Student
{
int phy,chem,math,total,avg;
String grade;
Marks(int rollno,String name,String address,int phy,int chem,int math)
{
	super(rollno,name,address);
	this.phy=phy;
	this.chem=chem;
	this.math=math;
	total=phy+chem+math;
	avg=total/3;
	if(avg>=70)
		grade="First Grade";
	else if(avg>=60)
		grade="Second Grade";
	else if(avg>=50)
		grade="Third Grade";
	else
		grade="Fail";
}
void display()
{
	super.display();
	System.out.println("the total is "+total);
	System.out.println("the average is "+avg);
	System.out.println("The grade is "+grade);
}
public static void main(String[] args)
{
	Marks ob=new Marks(101,"sandip","Bangalore",99,100,66);
	ob.display();
}
}