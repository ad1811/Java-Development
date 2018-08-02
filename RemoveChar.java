import java.util.Scanner;
public class RemoveChar {
	public static void main(String at[])
	{
		StringBuffer adi = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		adi.append(sc.next());
		System.out.println("enter char to be removed");
		char ch = sc.next().charAt(0);
		for(int i=0;i<adi.length();i++)
		{
			if(adi.charAt(i)==ch)
			{
				adi.deleteCharAt(i);
			}
		}
		System.out.println(adi);
		
		
	}

}
