import java.util.Scanner;
import java.lang.Math;

public class CalculateArea
{
public static void main(String[] args)
{
int base1,base2,height,radius,length,breadth,side,r=1,choice;
double a;
Scanner sc = new Scanner(System.in);
System.out.println("Area");
while (r!=0)
{
System.out.println("1. Triangle");
System.out.println("2. Circle");
System.out.println("3. Rectangle");
System.out.println("4. Trapezoid");
System.out.println("5. Hexagon");
System.out.println("Enter the number whose area you want to find: ");
choice = sc.nextInt();

switch (choice)
{

case 1:
System.out.println("Enter Base: ");
base1 = sc.nextInt();
System.out.println("Enter Height: ");
height = sc.nextInt();
a = 0.5*base1*height;
System.out.println("Area= "+a);
break;

case 2:
System.out.println("Enter Radius: ");
radius = sc.nextInt();
a = 3.14*radius*radius;
System.out.println("Area= "+a);
break;

case 3:
System.out.println("Enter length: ");
length = sc.nextInt();
System.out.println("Enter breadth: ");
breadth = sc.nextInt();
a = length*breadth;
System.out.println("Area= "+a);
break; 

case 4:
System.out.println("Enter Base1: ");
base1 = sc.nextInt();
System.out.println("Enter Base2: ");
base2 = sc.nextInt();
System.out.println("Enter Height: ");
height = sc.nextInt();
a = 0.5*(base1= base2)*height;
System.out.println("Area= "+a);
break;

case 5:
System.out.println("Enter Side: ");
side = sc.nextInt();
a = 0.5*3*(Math.sqrt(3))*side*side;
System.out.println("Area= "+a);
break;
}
System.out.println("Press 0 to Exit or any other number to continue: ");
r = sc.nextInt();
}
}
}