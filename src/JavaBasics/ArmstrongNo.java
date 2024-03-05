package JavaBasics;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
       // System.out.println((int)(Math.log10(12)) + 1 );
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isArmstrong(num)) System.out.println(" it's a Armstrong number");
        else System.out.println(" not a Armstrong num");
    }
    static boolean isArmstrong(int num){
        int orignal = num;
        int sum = 0;
        while(num !=0){
            int rem = num%10;
            sum+=rem*rem*rem;
            num/=10;
        }
        if(sum==orignal) return true;
        return false;
    }
}
