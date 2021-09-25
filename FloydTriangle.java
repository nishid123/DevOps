import java.util.Scanner;

public class FloydTriangle
{
public static void main(String[] args)
{
int i,j,n,k=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows for Floyd's Triangle: ");
n = sc.nextInt();
sc.close();
System.out.println("Floyd's Triangle");
System.out.println();
for (i=1;i<=n;i++)
{
for (j=1;j<=i;j++)
{
System.out.print(k + " ");
k++;
}
System.out.println();
}
}
}
