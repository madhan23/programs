import java.util.*;
import java.lang.*;
import java.io.*;


class Id
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,d,c=0;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	while(n>0)
	{
	d=n%10;
	c+=1;
	n=n/10;
	}
	System.out.println("digits:"+c);
	}
}
