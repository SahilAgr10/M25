package JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class p1 {
    public static void main(String[] args) {
        List<Integer> target = new ArrayList<>();
        target.add(0, 2);
        target.add(0,1);
        for(int i =0;i<target.size();i++){

            System.out.println(target.get(i));
        }
    }
}
