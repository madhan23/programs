/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);   
    
 for(i=2;i<count;++i)    
 {   
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
	}
}
