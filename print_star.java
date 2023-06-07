import java.util.Scanner;
class print_star3
{
public static void Print_multiple_chars(int i,char c)
{
for(int k=1;k<=i;k++)
System.out.print(c);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int j=sc.nextInt();
Print_multiple_chars(j,'*');
Print_multiple_chars(j+1,'+');
Print_multiple_chars(j+2,'-');
System.out.print("");

}
}