package JavaBasics;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(true){
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("x")) break;
            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to finish.");
            }
        }
        System.out.println("Thank you for the Inputs .\nyour Score entered is: " + sum);
    }
}
