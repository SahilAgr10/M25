package JavaBasics;

import java.util.Scanner;

public class findingEvenOrOddUsingBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any value");
        int a = sc.nextInt();
        even(a);
    }
    public static void even(int a){
        if((a|1)>a){
            System.out.println(" number is even");
        }else{
            System.out.println(" number is odd");
        }
    }
}
