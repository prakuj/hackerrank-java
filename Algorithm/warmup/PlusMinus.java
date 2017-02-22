import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    int data,n=sc.nextInt();
    int ctrp=0,ctrn=0,ctr0=0;
    for(int i=0;i<n;i++)
    {
    	data=sc.nextInt();
    	if(data>0)
    		ctrp++;
    	else if(data<0)
    		ctrn++;
    	else
    		ctr0++;
    }
    System.out.printf("%f\n",(ctrp*1.0)/n);
    System.out.printf("%f\n",(ctrn*1.0)/n);
    System.out.printf("%f\n",(ctr0*1.0)/n);
    sc.close();
    }
}