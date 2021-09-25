import java.util.*;

public class AddMatrix
{
public static void main(String[] args) 
{
int a, b, c, d;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of rows in first matrix: ");
a = sc.nextInt();
System.out.print("Enter the number of columns in first matrix:");
b = sc.nextInt();
System.out.print("Enter the number of rows in second matrix:");
c = sc.nextInt();
System.out.print("Enter the number of columns in second matrix:");
d = sc.nextInt();
if (a == c && b == d) 
{
int m[][] = new int[a][b];
int n[][] = new int[c][d];
int o[][] = new int[a][b];
System.out.println("Enter all the elements of first matrix: ");
for (int i = 0; i < a; i++) 
{
for (int j = 0; j < b; j++) 
{
m[i][j] = sc.nextInt();
}
}
System.out.println("Enter all the elements of second matrix:");
for (int i = 0; i < c; i++) 
{
for (int j = 0; j < d; j++) 
{
n[i][j] = sc.nextInt();
}
}
System.out.println("First Matrix: ");
for (int i = 0; i < a; i++) 
{
for (int j = 0; j < b; j++) 
{
System.out.print(m[i][j]+"  ");
}
System.out.println("");
}
System.out.println("Second Matrix: ");
for (int i = 0; i < c; i++) 
{
for (int j = 0; j < d; j++) 
{
System.out.print(n[i][j]+"  ");
}
System.out.println("");
}
for (int i = 0; i < a; i++) 
{
for (int j = 0; j < d; j++) 
{
for (int k = 0; k < b; k++) 
{
o[i][j] = m[i][j] + n[i][j];
}
}
}
System.out.println("Matrix after Addition: ");
for (int i = 0; i < a; i++) 
{
for (int j = 0; j < d; j++) 
{
System.out.print(o[i][j]+"  ");
}
System.out.println("");
}
}
else
{
System.out.println("Addition NOT Posible");
}
}
}