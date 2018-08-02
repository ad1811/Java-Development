import java.util.Scanner;
public class Klarge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int k = sc.nextInt();
		int l = 0,f=0;
		while(l<n)
		{
			f = 0;
			for(int i=0;i<n;i++)
			{
				if(arr[l]>arr[i])
					f++;
			}
			if(f==n-k)
			{
				System.out.println(arr[l]);
				break;
			}
			l++;
		}
		sc.close();

	}

}
