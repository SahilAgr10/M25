package JavaBasics;

import java.util.Scanner;

public class numbers_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        String oper = sc.next();
        operation2(a,b,oper);
    }
    public static void operation(int a,int b,String oper){
        if(oper.equals("+")) System.out.println(a+b);
        else if(oper.equals("-")) System.out.println(a-b);
        else if(oper.equals("*")) System.out.println(a*b);
        else if(oper.equals("/")) System.out.println(a/b);
        else System.out.println(" Operation not matching");
    }
    static void operation2(int a,int b,String oper){
        switch (oper){
            case "+" :
                System.out.println(a+b);
                break;
            case "-" :
                System.out.println(a-b);
                break;
            case "*" :
                System.out.println(a*b);
                break;
            case "/" :
                System.out.println(a/b);
                break;
            default:
                System.out.println(" Invalid operator");
        }
    }
}
