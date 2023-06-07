import java.util.Scanner;
class print_star1
{
public static void Print_multiple_star(int i)
{
for(int k=1;k<=i;k++)
System.out.println("*");
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int j=sc.nextInt();
Print_multiple_star(j);
System.out.println("");

}
}