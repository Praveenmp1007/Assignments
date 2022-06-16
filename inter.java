interface demo5
{
    public void run();
}
class sample1 implements demo5
{
    public void run()
    {
        System.out.println("Hii everyone");
    }
}
public class inter
{
    public static void main(String args[])
    {
        sample1 s1=new sample1();
        s1.run();
    }
}
