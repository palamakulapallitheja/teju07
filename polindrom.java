import java.util.Scanner;
public class polindrom
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int poli=0;
int temp,x;
temp=n;
while(n>0)
{
x=n%10;
n=n/10;
poli=poli*10+x;
}
System.out.print(poli);
if(temp==poli)
{
System.out.print("polidrom");
}
else
{
System.out.print("not polidrom");
}
}
}
