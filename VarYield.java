
import java.util.Scanner;

class VarYield {
    public static void main(String[] args) {
        int a ;
        String b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of month: ");
        a=sc.nextInt();
        // b=sc.nextInt();
        // c=sc.nextInt();
        b=switch(a)
        {
            case 11,12,1,2->
            {
                System.out.println("TOO COLD");
                 yield "WINTER Season";
             }
            
            case 3,4,5,6,7->
            {
                System.out.println("TOO HOT");
                yield "SUMMER Season";
            }   
            case 8,9,10->
            {
                System.out.println("Lovely Season");
                yield "RAINY SEASON";
            }  
            default->"INVALID INPUT";
        };
        System.out.println(b);
    }
}