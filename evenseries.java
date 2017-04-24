import java.io.*;
import java.util.Scanner;
class madhan {
	public static void main (String[] args) {
	    int i,n,v,cc=0,start,end;   
	 Scanner c=new Scanner(System.in);
	 start=c.nextInt();
	 end=c.nextInt();
     System.out.println("even number between "+start+ " to " +end);
      for(v=start;v<=end;v++)
      {
         if(v%2==0)
          {
             System.out.println(v);
      
          }
      }
      
	} 
} 
      
