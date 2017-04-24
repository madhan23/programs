import java.io.*;
import java.util.Scanner;
class madhan {
	public static void main (String[] args) {
	    int i,n,f=1;   
	 Scanner c=new Scanner(System.in);
	 n=c.nextInt();
 for(i=1;i<=n;i++)
      {
         f*=i;
       }
      System.out.println("Factorial of number "+n+ " is " +f);
      } 
} 
      
