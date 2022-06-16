class over
{
    public void test()
    {
        System.out.println("test method");
    }
}
class sample extends over
{
public void test()
{
    System.out.println("test overridden");
}
}
public class ride
{
    public static void main(String args[])
    {
     sample s1=new sample();
     s1.test();
    }
}
