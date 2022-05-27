
public class Floydtriangl {
 public static void main(String[] args) {
	 int x=0;
	 int y=1;
	 int z;
	 for(int i=1; i<=5; i++)
	 {
		 for(int j=1; j<=i; j++)
		 {
			 System.out.println(x+"\t ");
			 z=x+y;
			 x=y;
			 y=z;
					
			 
		 }
		 System.out.println("\n");
		 
	 }
	 
 }
}
