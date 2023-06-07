import java.util.Scanner;
public class pattern2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
char ch=str.charAt(0);
int row=sc.nextInt();
printPattern(ch,row);
}
public static void printPattern(char c,int n)
{
for(int i=n;i>=0;i--)
{
printLine(c,i);
} ui90-
}
public static void printLine(char c,int n)
{
for(int j=0;j<=n;j++)
{
System.out.print(c);
}
System.out.println();
}}