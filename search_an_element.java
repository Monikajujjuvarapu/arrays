import java.util.*;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int ele=s.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=s.nextInt();
		    
		}
		Boolean found=false;
		for(int i=0;i<n;i++){
		    if(ar[i]==ele){
		        found=true;
		        break;
		    }
		}
		if(found)
		System.out.println("YES");
		else
		System.out.println("NO");
	}
}
