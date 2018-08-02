import java.util.Scanner;
public class SubArrayZero {

	public static void main(String at[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			sum = 0;
			for(int j=i;j<n;j++)
			{
				sum = sum + arr[j];
				if(sum==0)
				{
					System.out.println("True");
					System.exit(0);
				}
			}
		}
		System.out.println("False");
	}
}
