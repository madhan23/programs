/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n;
	Scanner s=new Scanner (System.in);
	n=s.nextInt();
	if(n>0)
	{
		System.out.println("Your no is Positive");
	}
	else if(n==0)
	{
		System.out.println("Your no is Zero");
	}
	else
	{
		System.out.println("Your no is Negative");
	}
	}
}
