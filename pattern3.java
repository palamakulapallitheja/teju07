import java.util.Scanner;
public class pattern3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
char ch=str.charAt(0);
int row=sc.nextInt();
int x,y;
if(row%2==0)
{
x=row/2;
y=row/2;
printPattern(ch,x);
revpattern(ch,y);
}
else
{
x=row/2;
y=(row/2)+1;
printPattern(ch,x);
revpattern(ch,y);
}
}
public static void printPattern(char ch,int n)
{
for(int i=n;i>=0;i++)
{
printPattern(ch,i);
}
}
public static void printLine(char ch,int n)
{
for(int j=0;j<=n;j++)
{
System.out.print(ch);
}
}
public static void printrevpattern(char ch,int n)
{
for(int k=n;k<=1;k--)
{
printrevPttern(ch);
}
System.out.println("/n");
}
}