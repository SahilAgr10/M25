package JavaBasics;

import java.util.Scanner;

public class swaping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter two values");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(" a = "+ a + " b = "+ b);
        swap2(a,b);
    }
    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println(" a = "+ a + " b = "+ b);
    }
    // Swapping without creating variable
    public static void swap2(int a , int b){
        a = a-b; // assume a = 5 , b = 3
        b = a+b; // here a will be 2
        a = b-a;
        System.out.println(" a = "+ a + " b = "+ b);
    }
}
