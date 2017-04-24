import java.io.*;
import java.util.Scanner;
class madhan {
	public static void main (String[] args) {
	    int i,n,cc=0;   
	 Scanner c=new Scanner(System.in);
	 n=c.nextInt();
     System.out.println("Your a number : "+n);
     for(i=2;i<n;i++)
      {
          if(n%i==0)
          {
         cc=1;
         break;
          }
          else{
              cc=2;
              
          }
          
      } 
         if(cc==1)
         {
         System.out.println(" not a prime");
      }
      else
      {
             System.out.println("prime"); 
      }
      
      }
      
      
      
	}
