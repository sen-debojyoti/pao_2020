package exemplu2;

import com.sun.source.tree.Tree;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exemplu6 {

    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();

        set1.add(345);
        set1.add(32);
        set1.add(6);
        set1.add(1);
        set1.add(455);
        set1.add(455); // valoarea asta NU o sa apara


        for (Integer x : set1) {
            System.out.println(x);
        }

        
    }
}
