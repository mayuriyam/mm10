import java.io.*;
import java.util.*;
class digits
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        int sum=0;
        int a=sc.nextInt();
        for(sum=0;sum<=a;a=a/10)
        {
            
            sum=sum+1;
        }
        
        System.out.println(sum);
        
    }
}
