package Java_Code;

import java.util.Scanner;

public class Unit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit : ");
        int a = sc.nextInt();
        if(a<=100){
            System.out.println("Amount is : "+(a*1));
        } else if (a<=200) {
            System.out.println("Amount is : "+((100*1)+(a-100)*2));
        }
        else if(a<=300){
            System.out.println("Amount is : "+((100*1)+(100*2)+(a-200)*3));
        }
        else if (a<=400) {
            System.out.println("Amount is : "+(((a-300)*4)+((100*1)+(100*2)+(100*3))));
        }
        else
            System.out.println("Amount is : "+(a*7));
    }
}
