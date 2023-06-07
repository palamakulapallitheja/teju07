import java.util.Scanner;
public class ExtractDigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String sobj=sc.nextLine();
String res=" ";
for(int i=0;i<=sobj.length()-1;i++)
{
if((sobj.charAt(i)>='0')&&(sobj.charAt(i)<='9'))
{
res=res+sobj.charAt(i);
}
//System.out.print(sobj.charAt(i));
}
System.out.print(res);
}
}