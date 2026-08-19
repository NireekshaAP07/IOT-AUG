 import java.util.*;
 
 public class SetDemo
 {
    public static void main(String[] args)
        {
        Student ob=new Student(101,"sandip","bangalore");
        Student ob1=new Student(102,"shubam","bangalore");
        Student ob2=new Student(103,"trupti","bangalore");

        LinkedHashSet<Student> ts=new LinkedHashSet<Student>();
        ts.add(ob);
        ts.add(ob1);
        ts.add(ob2);
        System.out.println(ts);
        }
 }