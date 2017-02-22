//pankaj kumar
import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int tt=in.nextInt();
		for(int i=0;i<tt;i++)
		{
			int amnt=in.nextInt();
			int flav=in.nextInt();
			int[] a=new int[flav];
			for(int j=0;j<a.length;j++)
			{
				a[j]=in.nextInt();
			}
			outloop:
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					if(k!=j && (a[k]+a[j])==amnt)
					{
						System.out.println((j+1)+" "+(k+1));
						break outloop;
					}
				}
			}
		}
	}
}