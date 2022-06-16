public class demo
{
    public void demo()//constructor with zero arguments
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }
    public void demo(float a,float b)//constructor with arguments
    {
        float c=a/b;
        System.out.println(c);
    }
    public void demo(int a,int b,int c)//constructors with arguments
    {
        int d=a+b+c;
        System.out.println(d);
    }
    public static void main(String args[])
    {
        demo d1=new demo();
        d1.demo();
        d1.demo(20,6);
        d1.demo(1,2,3);
    }
}
