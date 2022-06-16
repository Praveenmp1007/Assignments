public class conditional_statements
{
    public static void main(String args[]) {
       /* int a=10;
        int b=20;
        if(a>b)
        {
            System.out.println("a is greater");
        }
        else
        {
            System.out.println("b is greater");
        }*/
        {
           /* switch(num)
            {
                case 1:System.out.println("option a is selected");
                case 2:System.out.println("option b is selected");
                case 3:System.out.println("option c is selected ");
            }*/
            /*int a=10;
                    for(a=1;a<=10;a++)
                     System.out.println(a);*/
            int i, a = 0, b = 0;
            int n = 1;
            a = n / 2;
            if (n == 0 || n == 1) {
                System.out.println("given number is a prime number");
            } else {
                for (i = 2; i <= a; i++)
                {
                    if(n % 2==0)
                    {
                        System.out.println("given number is not prime number");
                    }
                    b = 1;
                    break;
                }
            }
            if (b == 0) {
                System.out.println("is a prime number");
            }
        }


    }
    }

