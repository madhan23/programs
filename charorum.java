import java.io.*;
import java.util.*;

class madhan {
    
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
 char c = s.next().charAt(0);
	    if(Character.isDigit(c))
	    {
	        System.out.println("Number");
	    }
	    else{
	        System.out.println("Character");
	    }
	}
}
