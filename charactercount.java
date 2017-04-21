import java.io.*;
import java.util.*;

class GFG {
          
        public static void main (String[] args) {
	  Scanner m= new Scanner(System.in);
	  String s= new String();
	  s=m.nextLine();
	 char []a=s.toCharArray();
int l=s.length();
int t=0;
for(int i=0;i<l;i++)
{
    if(a[i]>='A'&&a[i]<='Z'||a[i]>='a'&&a[i]<='z')
    {
        t+=1;
    }
}
	 System.out.print(t);
	  
	 
}
}
