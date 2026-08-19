package stack;
import java.util.*;
public class stack
{
public static void main(String[] args)
{
Stack<Integer> st=new Stack<Integer>();
st.push(10);//insert the data
st.push(20);
st.push(30);
st.push(40);
st.push(50);
st.push(60);
for(Object obj:st)
	System.out.println(obj);
System.out.println("********************************");
System.out.println(st.pop());//delete the data
System.out.println(st.peek());//to see the last data
System.out.println(st.pop());//delete the data
System.out.println("********************************");
for(Object obj:st)
	System.out.println(obj);
}
}
