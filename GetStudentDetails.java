import java.util.Scanner;
public class GetStudentDetails 
{
public static void main(String args[])
{
	String name;
	int roll,sub1,sub2,sub3,sub4,sub5;
	Scanner SC=new Scanner(System.in);
			System.out.println("ENTER STUDENT NAME:");
			name=SC.nextLine();
			System.out.println("ENTER ROLL NUMBER:");
			roll=SC.nextInt();
			System.out.println("Enter marks in sub1,sub2,sub3,sub4,sub5:");
			sub1=SC.nextInt();
			sub2=SC.nextInt();
			sub3=SC.nextInt();
			sub4=SC.nextInt();
			sub5=SC.nextInt();
	int total=	sub1+sub2+sub3+sub4+sub5;
	float perc=(float)total/500*100;
	System.out.println("Roll Number:"+roll+"\tName:"+name);
	System.out.println("Marks(sub1,sub2,sub3,sub4,sub5):"+sub1+","+sub2+","+sub3+","+sub4+","+sub5);
	System.out.println("Total: "+total+"\tpercentage:"+perc);
}
}