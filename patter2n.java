import java.util.Scanner;
public class akila
{
    public static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=aki.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a+1-i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
