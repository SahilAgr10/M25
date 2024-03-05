package JavaBasics;
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        fib(a);
    }
    static void fib(int a ){
        int p = 0;
        int q = 1;
        if(a == 0 || a ==1) System.out.println(a);
        else{
            System.out.println(p);
            for(int i = 2;i< a;i++){
                System.out.println(q);
                int temp = q;
                q = p+q;
                p = temp;

            }
        }
        System.out.println(q);
    }
}
