import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner c=new Scanner(System.in);
        int n=c.nextInt();
        long sum=0;
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
            {
         arr[i]=c.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}