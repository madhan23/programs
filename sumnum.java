/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,t=0;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		for(int j=0;j<=n;j++)
		{
			t+=j;
		}
		System.out.println("sum :"+t);
	}
}
