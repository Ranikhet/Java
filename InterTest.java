interface I1
{
void foo1();
}
interface I2
{
 void foo2();
}
class Inter implements I1
{
public void foo1()
{
System.out.println("interface 1");
}
public void foo2()
{
System.out.println("interface 2");
}
}
public class InterTest
{

public static void main(String[] args)
{
Inter oot= new Inter();
oot.foo1();
oot.foo2();
}
}
