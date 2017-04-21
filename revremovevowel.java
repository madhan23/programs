import java.io.*;
import java.util.*;

class GFG {
          
        public static void main (String[] args) {
	  Scanner m= new Scanner(System.in);
	  String s= new String();
	  String bb="";
	  s=m.nextLine();
	 char[] x=s.toCharArray();
	 char n[]=new char[10];
int l,j=0,i;
l=s.length();
for(i=l-1;i>=0;i--)
{
n[j]=x[i];
j++;
}
	 System.out.println("reverse String:");
	   System.out.print(n);
	   j=0;
String k = s.replaceAll("[aeiouAEIOU]", "");
     
 
  System.out.println("\nvowels removed:");
 System.out.print(k);
}

}
