package JavaBasics;
import java.util.Scanner;
public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i =100;i<=999;i++){
            if(isArmstrong(i)) System.out.println(i);
        }}// System.out.println((int)(Math.log10(12)) + 1 );
    static boolean isArmstrong(int num){
        int orignal = num;
        int sum = 0;
        while(num !=0){
            int rem = num%10;
            sum+=rem*rem*rem;
            num/=10;
        }
        return sum == orignal;
    }
}
