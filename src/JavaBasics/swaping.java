package JavaBasics;

import java.util.Scanner;

public class swaping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter two values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(" Before :");
        System.out.println(" a = "+ a + " b = "+ b);
        System.out.println(" After :");
        swap(a,b);
        swapWithoutVariable(a,b);
        swapUsingBitOperator(a,b);
    }
    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println(" a = "+ a + " b = "+ b);
    }
    // Swapping without creating variable
    public static void swapWithoutVariable(int a , int b){
        a = a-b; // assume a = 5 , b = 3
        b = a+b; // here a will be 2 , b = 5
        a = b-a; // here a will be 3
        System.out.println(" a = "+ a + " b = "+ b);
    }
    // Swapping with bit operator
    public static void swapUsingBitOperator(int a , int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(" a = "+ a + " b = "+ b);
    }
}
