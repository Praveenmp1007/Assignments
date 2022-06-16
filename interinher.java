interface job
{
    public void name();
}
class training implements job
{
    public void name()
    {
        String s1="Praveen";
        System.out.println(s1);
    }
}
class WFH implements job
{
    public void name()
    {
        String s2="Associate Software Engineering";
        System.out.println(s2);
    }
}
public class interinher
{
    public static void main(String args[])
    {
       /* job j1;
        j1=new training();
        j1.name();
        j1=new WFH();
        j1.name();*/
       training t1=new training();
       t1.name();
       WFH t2=new WFH();
       t2.name();
    }
}
