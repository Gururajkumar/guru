import java.util.Scanner;
 
class guvi1
{
    public static void main(String args[])
    {
        int n;
       
        Scanner in=new Scanner(System.in);
         
        System.out.print("Enter any integer value: ");
        n=in.nextInt();
         
        if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else
            System.out.println("IT's ZERO.");
         
    }
}