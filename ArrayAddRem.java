import java.util.Arrays;
import java.util.*;
class ArrayAddRem
{
public static void main(String[]args)
{
int a[]={4,6,7,9,3,0,1};
System.out.println("Array elements before insertion:"(Arrays.toString(a)));
int l=a.length();
int newarr[]=new int [l+1];
System.out.println("Add an element:");
int elem=sc.nextInt();
for(int i=0;i<l+1;i++)
{
newarr{i}=a{i];
}
newarr[l+1]=elem;
System.out.println("Array elements after insertion pf element:"+(Array.toString(newarr)));
System.out.println("Array after removing an element:");
for(int i=0;i<l;i++)
{
newarr[i]=newarr[i+1];
}
System.out.println(Arrays.toString(newarr));
}
}
