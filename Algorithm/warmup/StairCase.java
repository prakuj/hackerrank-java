import java.io.*;
import java.util.*;
//pankaj kumar
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    int i,j,x,n=sc.nextInt();
    for(i=n;i>=1;i--)
    {
    	for(j=1;j<=n;j++)
    	{
    		if(j<=i-1)
    			System.out.print(" ");
    		else
    			System.out.print("#");
    	}
    	System.out.println();
    }
    sc.close();
    }
}