
class customer
 {
     private String empname,empdept;
     private int id;
     public int getid()
     {
         return id;
     }
     public void setid(int id)
     {
         this.id=id;
     }
     public String getempname()
     {
         return empname;
     }
     public void setempname(String empname)
     {
         this.empname=empname;
     }
     public String getempdept()
     {
         return empdept;
     }
     public void setempdept(String empdept)
     {
         this.empdept=empdept;
     }
}
public class encap
{
    public static void main(String args[])
    {
        customer c1=new customer();
        c1.setempdept("BECA44");
        c1.setempname("Praveen");
        c1.setid(48781);
    }
   /* public static void display(customer c)
    {
        System.out.println(c.getempdept());
        System.out.println(c.getempname());
        System.out.println(c.getid());
    }*/
}
