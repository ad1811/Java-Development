import java.util.Scanner;
public class student {
	
	String name;
	String code;
	static Scanner sc = new Scanner(System.in);
	public static void main(String at[])
	{
		student obj = new student();
		obj.scan();
		if(obj.code.length()>3||obj.code.length()<1)
		{
			System.out.println("Error");
		}
		else
		{
			System.out.println("Student: " + obj.name);
		for(int i=0;i<obj.code.length();i++)
		{
			if(i==0)
			{
			switch(obj.code.charAt(i))
			{
			case 'M':
				System.out.println("Major: Mathematics");
				break;
			case 'C':
				System.out.println("Major: Computer Science");
				break;
			case 'I':
				System.out.println("Major: Information Technology");
				break;
			case 'P':
				System.out.println("Major: Physics");
				break;
			default:
				System.out.println("Error");
				break;
			}
			}
			if(i==1)
			{
				if(obj.code.charAt(i)<1&&obj.code.charAt(i)>4)
				{
					System.out.println("Error");
					break;
				}
			
			}
			if(i==2)
			{
				switch(obj.code.charAt(i))
				{
				case 'B':
					System.out.println("Campus: Brampton");
					break;
				case 'O':
					System.out.println("Campus: Oakville");
					break;
				case 'M':
					System.out.println("Campus: Missisauga");
					break;
				default:
					System.out.println("Error");
					break;
				}
			}
			
		}
		}
	}
	void scan()
	{
		System.out.println("Enter Student Name: ");
		name = sc.next();
		System.out.println("Enter the code: ");
		code = sc.next();
	}

}
