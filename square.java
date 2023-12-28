import java.util.Scanner;
public class akila{
    public static void main(String args[]){
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the size of the Square:");
        int a=aki.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
        if(i==0||j==0||i==a-1||j==a-1)
        {
            System.out.print("*");
        }else {
            System.out.print(" ");
        }}
            System.out.println();
        }}
}
