import java.util.Scanner;

abstract class Class1 

{

abstract void disp();

}
class2 extends class1
{

void disp()

{

int add,sub,mul,div;

Scanner s = new Scanner(System.in);

System.out.println("Enter first no :");

int num1 = s.nextInt();

System.out.println("Enter second no :");

int num2 = s.nextInt();

add=num1+num2;

sub=num1-num2;

mul=num1*num2;

div=num1/num2;

System.out.println("Addition is :"+ add);

System.out.println("Subtraction is :"+ sub);

System.out.println("Multiplication is :"+ mul);
System.out.println("Division is :"+ div);

}

public static void main(String[] args) {

Class2 a = new Class2();

a.disp();

}

}