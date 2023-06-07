import java.util.Scanner;
public class UpperCase
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String c="";
int ascii;
for(int i=0;i<=s.length()-1;i++)
{
if(s.charAt(i)>='a'&&s.charAt(i)<='z')
{
ascii=s.charAt(i);
ascii=ascii-32;
c=c+(char)ascii;
}
else
{
c=c+s.charAt(i);
}
}
System.out.print("c "+c);

}
}
