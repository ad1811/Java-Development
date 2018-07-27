import java.util.Scanner;
public class array2 {

	int a[];
	int n;
	Scanner sc = new Scanner(System.in);
	public static void main(String at[])
	{
		array2 obj = new array2();
		obj.scan();
		obj.sort();
		obj.largest();
	}
	
	void largest()
	{
		int number=0,x=1;
	  	for(int i=0;i<n;i++)
	  	{
	  		number = number + a[i]*x;
	  		x = x*10;
	  	}
	  	System.out.println(number);
	}
	
	void sort()
	{
		int temp;
	  for(int i=0;i<n;i++)
	  {
		  for(int j=i+1;j<n;j++)
		  {
			  if(a[i]>a[j])
			  {
				  temp = a[i];
				  a[i] = a[j];
				  a[j] = temp;
			  }
		  }
	  }
	}
	
	void scan()
	{
		n = sc.nextInt();
		a = new int[10];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
	}
}
