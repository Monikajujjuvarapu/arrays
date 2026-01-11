import java.util.*;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();  

		while(t-- > 0){
		    int n = s.nextInt();
		    int ar[] = new int[n];

		    for(int i = 0; i < n; i++){
		        ar[i] = s.nextInt();
		    }

		    int max = ar[0];
		    for(int i = 1; i < n; i++){
		        if(ar[i] > max)
		            max = ar[i];
		    }

		    System.out.println(max);
		}
	}
}
