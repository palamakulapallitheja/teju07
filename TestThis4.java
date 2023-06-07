class A
{
A()
{
System.out.println("hello A");
}
A(int x)
{
this();
System.out.println(x);
}
}
class TestThis4
{
public static void main(String args[])
{
A a=new A(10);
}
}
