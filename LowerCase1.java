import java.util.Scanner;
public class LowerCase1
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String c="";
int ascii;
for(int i=0;i<=s.length()-1;i++)
{
if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
{
ascii=s.charAt(i);
ascii=ascii+32;
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
