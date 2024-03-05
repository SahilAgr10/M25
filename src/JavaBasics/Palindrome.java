package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(isPalindrome(str)) System.out.println(" yes");
        else System.out.println("No");
    }
    static boolean isPalindrome(String str ){
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]) {
                return false;
            }
            else{
                i++;
                j--;
            }
        }return true;
    }
}
