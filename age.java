import java.util.*;
public class age {
    public static void main(String args[])
    {   System.out.println("Enter your age: ");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        age(a);

    }
    public static void age(int m)
    {
        if(m>18)
        {
            System.out.println("can vote");
        }
        else
        {
           System.out.println("cannot vote"); 
        }
    }
    
}
