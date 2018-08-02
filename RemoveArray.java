import java.util.Scanner;
public class RemoveArray {
public static void main(String at[])
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k=0;
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
		arr[i] = sc.nextInt();
	while(k<n)
	{
		for(int j=k+1;j<n;j++)
		{
			if(arr[k]==arr[j])
				arr[j] = 0;
		}
		k++;
	}
	for(int i=0;i<n;i++)
		System.out.println(arr[i]);
}
}
