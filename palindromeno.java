import java.io.*;
import java.util.*;

class GFG {
          
        public static void main (String[] args) {
	  Scanner m= new Scanner(System.in);
	  int n,t,g,f,s=0;
	 
	   n=m.nextInt();
	    t=n;
	 while(n>0)
	 {
	     g=n%10;
	     s=(s*10)+g;
	     n=n/10;
	      
	 }if(t==s){
	   System.out.println("palindrome");
	 }
	 else
	 {
	    System.out.println("not palindrome"); 
	 }
}
}
