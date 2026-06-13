package Java_Code;

import java.util.Scanner;

public class Greatest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 Integer : ");
        int a = sc.nextInt();
        System.out.println("Enter 2 Integer : ");
        int b = sc.nextInt();
        System.out.println("Enter 3 Integer : ");
        int c = sc.nextInt();
        System.out.println("Enter 4 Integer : ");
        int d = sc.nextInt();
        if (a>b){
            if (a>c){
                if (a>d){
                    System.out.println("Greatest is "+a);
                }
                else
                    System.out.println("Greatest is "+d);
            }
            else {
                if (c>d)
                    System.out.println("Greatest is "+c);
                else
                    System.out.println("Greatest is "+d);
            }
        }
        else {
            if (b>c){
                if (b>d)
                    System.out.println("Greatest is "+b);
                else
                    System.out.println("Greatest is "+d);
            }
            else {
                if (c>d)
                    System.out.println("Greatest is "+c);
                else
                    System.out.println("Greatest is "+d);
            }
        }

        //Another way
        if (a>b && a>c && a>d)
            System.out.println("Greatest is "+a);
        else if (b>c && b>d)
            System.out.println("Greatest is "+b);
        else if (c>d)
            System.out.println("Greatest is "+c);
        else
            System.out.println("Greatest is "+d);
    }
}
