import java.util.Scanner;
public class PairSum {

	public static void main(String at[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum,k=0,c=0;
		int arr[] = new int[n];
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		sum = sc.nextInt();
		while(k<n)
		{
			for(int i=k+1;i<n;i++)
			{
				if(arr[k]+arr[i]==sum)
				{
					a[c] = arr[k];
					b[c] = arr[i];
					c++;
				}
			}
			k++;
		}
		for(int i=0;i<c;i++)
		{
			System.out.println(a[i] + "," + b[i]);
		}
		sc.close();
	}
}
