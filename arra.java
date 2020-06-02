/*int [] arr = new int[5]; Array Creation 
int arr []= new int[5];
int arr[]=new int[]{2,4,6,8,10}
int arr[]=new int[5]{2,4,6,8,10}// Error:We cannot mention size and values together.
int arr[]={2,4,6,8,10}
*/
import java.util.*;
public class arra
{
    public static void main(String[] args)
    {
        int [] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("\n"+arr[i]);
        }
    }
}