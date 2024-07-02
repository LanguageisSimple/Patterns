public class Pattern_1
{
    public static void main(String args[])
    {
        int a=1,b=-1;
        for(int i=1;i<=10;i++)
        {
            if(i%2==1)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(b);
            }
            a+=2;
            b-=2;
        }
        
    }
}