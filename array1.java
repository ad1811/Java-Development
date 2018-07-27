import java.util.Scanner;
public class array1 {

	int n;
	int []a = new int[5];
	char s;
	Scanner sc = new Scanner(System.in);
	public static void main(String at[])
	{
		array1 obj = new array1();
		obj.scan();
		if(obj.s=='l' || obj.s=='L')
		{
			obj.left();
			obj.print();
		}
		else if(obj.s=='r' || obj.s=='R')
		{
			obj.right();
			obj.print();
		}
		
		obj.sort();
    	obj.count();
		
		
	}
	void count()
	{
		int f=1,t=0,z=0;
		int k[] = new int[5];
		int l[] = new int[5];
		for(int i=0;i<5;i++)
		{
			
			for(int j=i+1;j<5;j++)
			{
				if(a[i]==a[j])
				{
						f++;
				}
			
			}
			if(f>0)
			{
				k[t] = a[i];
				l[t] = f;
				t++;
			}
			f = 1;
		}
		
			for(int j=t-1;j>=0;j--)
			{
				z = 0;
				for(int i=j-1;i>=0;i--)
				{
					if(k[j]==k[i])
					{
						z++;
					}
				}
				if(z==0)
				{
					System.out.print(k[j]);
					System.out.print(" is repeated ");
					System.out.print(l[j]);
					System.out.print(" times\n");
				}
			}	
	}
	
	void sort()
	{
		int temp;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Max Element is ");
		System.out.println(a[0]);
		System.out.println("Min Element is ");
		System.out.println(a[4]);
	}
	
	void left()
	{
		int temp1;
		for(int i=0;i<n;i++)
		{
			temp1 = a[0];
			for(int j=1;j<5;j++)
			{
				a[j-1] = a[j];
			}
			a[4] = temp1;
		}
		
	}
	
	void right()
	{
		int temp1;
		for(int i=0;i<n;i++)
		{
			temp1 = a[4];
			for(int j=4;j>0;j--)
			{
				a[j] = a[j-1];
			}
			a[0] = temp1;
		}
	}
	
	void print()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	void scan()
	{
		
		for(int i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		
		n = sc.nextInt();
		s = sc.next().charAt(0);
	}
	
}
