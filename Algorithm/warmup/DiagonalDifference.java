import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        int n=c.nextInt();
        int sum1=0,sum2=0;
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
                {
                arr[i][j]=c.nextInt();
                if(i==j)
                    sum1+=arr[i][j];
                if(i+j==n-1)
                    sum2+=arr[i][j];
            }
        }
        System.out.println(Math.abs(sum1-sum2));
            
    }
}