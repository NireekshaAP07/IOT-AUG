package Tuesday;
public class Student 
{
int rollno;
String name,address;
Student(int rollno,String name,String address)
{
	this.rollno=rollno;
	this.name=name;
	this.address=address;
}
void display()
{
	System.out.println("the rollno is"+rollno+"the name is "+name+"the address is "+address);
}
}
