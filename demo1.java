public class demo1
{
    public void test()
    {
        int a=2;
        int b=8;
        int c=a+b;
        System.out.println(c);
    }
    public void test1(int a,int b)
    {
      int c=a*b;
        System.out.println(c);
    }
    public void test2(int a,int b)
    {
        int c=a-b;
        System.out.println(c);
    }
    public void test3(int a,int b)
    {
        int c=a/b;
        System.out.println(c);
    }
    public void test4(int a,int b)
    {
        int c=a%b;
        System.out.println(c);
    }
    public static void main(String args[])
    {
        demo1 t1=new demo1();
        t1.test();
        t1.test1(2,4);
        t1.test2(10,4);
        t1.test3(20,6);
        t1.test4(121,11);
    }
}
