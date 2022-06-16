class parent
{
public static void test()
{
    System.out.println("Hii");
}
}
class student1 extends parent
{
    public static void test1()
    {
        System.out.println("hello");
    }
}
class student2 extends student1
{
    public static void test2()
    {
        System.out.println("How r u");
    }
}
public class hierarchi
{
    public static void main(String args[])
    {
        student2 s2=new student2();
        s2.test();
        s2.test1();
        s2.test2();
    }
}
