
import java.util.Scanner;
public class password1 {

	public static void main(String at[])
	{
		String password;
		Scanner sc = new Scanner(System.in);
		password = sc.next();
		int length,a=0,n=0;
		length = password.length();
		if(length>4&&length<13)
		{
			for(int i=0;i<length;i++)
			{
				if(a==5||n==5)
				{
					System.out.println("Invalid Password");
					break;
					
				}
				else if((password.charAt(i)>='A'&&password.charAt(i)<='z')||
						(password.charAt(i)>='0'&&password.charAt(i)<='9'))
				{
					if((password.charAt(i)>='A'&&password.charAt(i)<='z'))
					{
						
							a++;
							n = 0;
						
					}
					else
					{
						n++;
						a = 0;
					}
					continue;
				}
				else
				{
					System.out.println("Invalid Password");
					break;
				}
				
			}
		}
		else
		{
			System.out.println("Invalid Password");
		}
	}
}
