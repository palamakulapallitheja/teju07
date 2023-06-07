import java.util.Scanner;
public class polindrom
{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
String n;
String c="";
System.out.print("enter a string:");
n=sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
c=c+n.charAt(i);
}
if(n.equalsIgnoreCase(c))
{
System.out.println("p0lindrom");
}
else
{
System.out.println("not polidrom");
}
}}