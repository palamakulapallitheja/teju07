import java.util.Scanner;
public class smallest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if((a<b)&&(a<c))
{

System.out.println("Smallest is:"+a);
}
else if((b<c)&&(b<a))
{
System.out.println("Smallest is:"+b);

}
else
{
System.out.println("Smallest is:"+c);

}
}
}

 