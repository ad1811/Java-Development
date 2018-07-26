import java.util.Scanner;
class shape
{
static Scanner sc = new Scanner(System.in);

public static void main(String at[])
{
  int l,h;
  double r;
  int ans;
  double answer;
  shape obj = new shape();
  l = sc.nextInt();
  h = sc.nextInt();
  r = sc.nextDouble(); 
  ans = obj.calculateArea(l,h);
  System.out.println("Area of rectangle is " + ans);
  ans = obj.calculatePeri(l,h);
  System.out.println("perimeter of rectangle is " + ans);
  answer = obj.calculateArea(r);
  System.out.println("Area of circle is " + answer);
  answer = obj.calculatePeri(r);
  System.out.println("perimeter of circle is " + answer);
}
int calculateArea(int l,int h)
{
 int area;
area = l*h;
return area; 
}
double calculateArea(double r)
{
double area;
area = 3.14*r*r;
return area;
}
int calculatePeri(int l,int h)
{
 int peri;
peri = 2*(l+h);
return peri;
}
double calculatePeri(double r)
{
double peri;
peri = 2*3.14*r;
return peri;
}
}