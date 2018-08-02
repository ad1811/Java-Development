import java.util.Scanner;
public class FirstRepeat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int l = 0;
		while(l<n)
		{
			for(int i=l+1;i<n;i++)
			{
				if(arr[l]==arr[i])
				{
					System.out.println(arr[l]);
					System.exit(0);
				}
					
			}
			l++;
		}
		sc.close();

	}

}
