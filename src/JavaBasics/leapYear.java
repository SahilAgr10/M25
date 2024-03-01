package JavaBasics;
import java.util.*;

//Input a year and find whether it is a leap year or not.
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lYear = sc.nextInt();
        if(isLeapYear(lYear)){
            System.out.println("It's a Leap Year");
        } else{
            System.out.println("not a leap year");
        }
    }
    public static boolean isLeapYear(int year){
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
