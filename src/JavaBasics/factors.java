package JavaBasics;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        System.out.println(" keep entering numbers to get factors or x to end the program");
        factor();
    }
    static void factor(){
        while(true){
            Scanner sc = new Scanner(System.in);
            String str  = sc.nextLine();
            if(str.equalsIgnoreCase("x")) break;

           try {
               int n = Integer.parseInt(str);
               for (int i = 1; i <= n; i++) {
                   if (n % i == 0) System.out.println(i);
               }

           }catch (NumberFormatException e) {
               System.out.println("Invalid input. Please enter a number or 'x' to finish.");
           }
        }
    }

}
