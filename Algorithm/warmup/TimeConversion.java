import java.io.*;
import java.util.*;
//pankaj kumar
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    	String st=sc.next();
    	String hour=st.substring(0,2);
    	int hr=Integer.parseInt(hour);
    	if(st.endsWith("AM")||st.endsWith("am"))
    	{
    		if(hr==12)
    		System.out.println("00"+st.substring(2, st.length()-2));
    		else
    			System.out.println(st.substring(0,st.length()-2));
    	}
    	else{
    	if(hr==12)
    		System.out.println(st.substring(0,st.length()-2));
    	else{
    	hr+=12;
    	System.out.println(hr+st.substring(2,st.length()-2));
    	}
    	
    	}
    			sc.close();
    }
}