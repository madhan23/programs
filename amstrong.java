import java.io.*;
import java.util.Scanner;
class madhan {
	public static void main (String[] args) {
	    int i,n,l,d,f=0,m;   
	 Scanner c=new Scanner(System.in);
	 n=c.nextInt();
	 m=n;
	  l = String.valueOf(n).length();
	  
while(n>0)
{
    d=n%10;
    f+=Math.pow(d,l);
 
    n=n/10;
    }
if(m==f)
{
    System.out.println("Amstrong Number");
}
else{
     System.out.println(" not a Amstrong Number");
}

}
} 
      
