import java.lang.StringBuilder;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner x= new Scanner (System.in);
        String m,c;
        m=x.nextLine();
StringBuilder b = new StringBuilder(m);
b.reverse();
c=b.toString();
if(m.equals(c))
{
System.out.print("palindrome");
    
    }
    else{
        System.out.print("not a palindrome");
    }
}
}
