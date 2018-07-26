import java.util.Scanner;
class shape2
{
static Scanner sc = new Scanner(System.in);

public static void main(String at[])
{
  int l,h;
  double r;
  int ans;
  double answer;
  shape2 obj = new shape2();
  l = sc.nextInt();
  h = sc.nextInt();
  r = sc.nextDouble(); 
  ans = obj.rectangleArea(l,h);
  System.out.println("Area of rectangle is " + ans);
  ans = obj.rectanglePeri(l,h);
  System.out.println("perimeter of rectangle is " + ans);
  answer = obj.circleArea(r);
  System.out.println("Area of circle is " + answer);
  answer = obj.circlePeri(r);
  System.out.println("perimeter of circle is " + answer);
}
int rectangleArea(int l,int h)
{
 int area;
area = l*h;
return area; 
}
double circleArea(double r)
{
double area;
area = 3.14*r*r;
return area;
}
int rectanglePeri(int l,int h)
{
 int peri;
peri = 2*(l+h);
return peri;
}
double circlePeri(double r)
{
double peri;
peri = 2*3.14*r;
return peri;
}
}