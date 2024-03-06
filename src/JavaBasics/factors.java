package JavaBasics;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        System.out.println(" keep entering numbers to get factors or 0 to end the program");
        factor();
    }
    static void factor(){
        while(true){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n==0) break;
            for(int i = 1;i<=n;i++){
                if(n%i==0) System.out.println(i);
            }
        }
    }

}
