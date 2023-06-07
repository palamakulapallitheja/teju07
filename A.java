import java.util.Scanner;
public class A
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<=10;i++)
{
if(i%2==0)
{
System.out.print(i);
if(i<n)
System.out.print("$");
}
}
}
}
