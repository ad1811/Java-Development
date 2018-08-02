import java.util.Scanner;
public class LarSmall {

	public static void main(String at[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int large=0,small=0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			if(i==0)
			{
				large = arr[i];
				small = arr[i];
			}
			if(i>0)
			{
			if(arr[i]>=arr[i-1])
				large = arr[i];
			else
				small = arr[i];
			
			}
		}
		System.out.println("largest is " + large + " smallest is " + small);
	}
}
