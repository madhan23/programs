import java.util.*;

class mul {
	public static void main (String[] args) {
		  Scanner c=new Scanner(System.in);
		  int n,i;
           n=c.nextInt();
           System.out.println("multplication table "+n+" is:");
           for(i=1;i<=10;i++)
           {
		System.out.println(+n+"*"+i+"="+(i*n));
           }
	}
}
