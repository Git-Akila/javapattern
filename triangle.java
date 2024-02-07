import java.util.Scanner;
public class pattern1{
public static void main(String args[]) {
    Scanner aki=new Scanner(System.in);
    System.out.println("Enter the Size:");
    int a=aki.nextInt();int z=1;
    for(int i=1;i<=a;i++) {
        for (int j = a-1; j >=i; j--) {

            System.out.print(" ");

        }for(int k=1;k<=z;k++){
            System.out.print("*");
        }z+=2;
        System.out.println();

    }}}
