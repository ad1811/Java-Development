import java.util.Scanner;
public class occur {

	public static void main(String at[])
	{
		String adi;
		int f=0;
		Scanner sc = new Scanner(System.in);
		adi = sc.nextLine();
		char c = sc.next().charAt(0);
		for(int i=0;i<adi.length();i++)
		{
			if(c==adi.charAt(i))
			{
				f++;
			}
		}
		System.out.println(f);

		
		
	}
}
