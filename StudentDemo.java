class Student
{ // instance variables
  int sno;
  String name;
  String course;
  //constructor  with arguments
  Student( int no,String sn,String c )
  {
     sno=no;
     name=sn;
     course=c;
   }
    void display()
   {
    System.out.println("Student reg no"+sno);
    System.out.println("Student name"+name);
    System.out.println("Studentcourse"+course);
}
 }

public class StudentDemo
{
public static void main(String []args)
{
 Student s1=new Student(123,"ravi","B.Tech");
 Student s2=new Student( 456,"rani","M.Tech");
 s1.display();
 s2.display();
}
}
