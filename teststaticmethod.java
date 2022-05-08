class Student
{
int rollno;
String name;
static String college="GOJAN";
static void change()
{
college="GSBT";
}
Student(int r,String n)
{
rollno = r;
name = n;
}
void display(){System.out.println(rollno+""+name+""+college);
}
}
class teststaticmethod
{
public static void main(String args[])
{
Student.change();
Student s1 = new Student(01,"Kaviya");
Student s2 = new Student(02,"Diya");
Student s3 = new Student(03,"Sneha");
s1.display();
s2.display();
s3.display();
}
}