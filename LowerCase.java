import java.util.Scanner;
import java.util.Scanner;
class LowerCase
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String c="";
int ascii;
for(int i=s.length()-1;i>=0;i--)
{
if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
{
ascii=s.charAt(i);
ascii+=32;
c=c+(char)ascii;
}
else
{
c=c+s.charAt(i);
}
}
System.out.println("c:"+c);
s=c;
String tc="";
for(int i=s.length()-1;i>=0;i--)
{
tc=tc+s.charAt(i);
}

//System.out.print(s+" "+c);
if(s.equals(tc))
{
System.out.println("Yes");
}
else 
{
System.out.println("NO");
}
}
}