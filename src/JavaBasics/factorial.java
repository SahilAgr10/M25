package JavaBasics;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }
    public static void fact(int n){
        int count = 1;
        if(n==1 || n ==0) System.out.println(" Factorial will be 1");
        else{
            if(n<0){
                n = n*-1;
            }
            for(int i = 2;i<=n;i++){
                count*=i;
            }
            System.out.println(" Factorial will be " + count);

        }


    }
}
