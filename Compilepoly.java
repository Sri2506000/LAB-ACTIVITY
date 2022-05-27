import java.util.Scanner;
public class Compilepoly {

	void add(int a,int b) {
		int c=a+b;
		System.out.println("SUM IS:"+c);
	}
	void add(int a,int b,int c) {
		int d=a+b;
		System.out.println("SUM IS: "+d);
	}
	public static void main(String[] args) {
		Compilepoly p=new Compilepoly();
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THREE NUMBERS:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		p.add(a,b);
		p.add(a,b,c);
		
	}
}

