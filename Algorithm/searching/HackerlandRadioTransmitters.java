//pankaj kumar
import java.util.*;
public class HackerLand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		TreeSet<Integer> t=new TreeSet<Integer>();
		for(int i=0;i<n;i++)
			t.add(sc.nextInt());
		
		int count = 0,reference=t.first();
		while(true){
			if(t.last()-reference <= k){
				count++;
				break;
			}
			reference = t.floor(reference+k);
			count++;
			if(t.higher(reference+k)!=null){
				reference=t.higher(reference+k);
			}
			else
				break;
		}
        System.out.println(count);
	}

}

//int minTransmitter(int *p, int n, int k)
//{
//	sort(p,p+n,less<int>());
//	
//	int begin = 0;
//	int pos = 0;
//	int end = 0;
//	int cnt = 0;
//	while(begin<n)
//	{
//		cnt++;
//
//		pos = begin;
//		while(pos<n-1 && p[pos+1]-p[begin]<=k)
//			pos++;
//
//		end = pos;
//		while(end<n-1 && p[end+1]-p[pos]<=k)
//			end++;
//
//		begin = end+1;
//	}
//	
//	return cnt;
//}
