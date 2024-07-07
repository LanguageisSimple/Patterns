import java.util.*;
@SuppressWarnings("unused")
public class Pattern_5
{
    public static void m1()
    {
         for(int i=1;i<=3;i++)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print(j);
                }
                System.out.println();
            }
    }

    public static void m2()
    {
        for(int i=1;i<=3;i++)
        {
            for(int j=3;j>=i;j--)
            {
                System.out.print(j);
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        m1();
        m2();
    }
}