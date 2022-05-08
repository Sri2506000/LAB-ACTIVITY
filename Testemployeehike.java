class employee
{
int empname;
int sal=50000;
void disp()
{
System.out.println("employee name kavi");
System.out.println("employee salary is:"+sal);
}
}
class permanentemp extends employee
{
double hike=0.5;
void disp1()
{
System.out.println("permanent employee salary hike is:"+(sal+(sal*hike)));
}
}
class temporaryemp extends employee
{
double hike=0.3;
void disp2()
{
System.out.println(" temporary employee salary hike is:"+(sal+(sal*hike)));
}
}
class testemployeehike
{
public static void main(String args[])
{
permanentemp p=new permanentemp();
temporaryemp t=new temporaryemp();
p.disp();
p.disp1();
t.disp();
t.disp2();
}
}