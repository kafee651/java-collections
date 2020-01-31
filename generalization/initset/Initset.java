package generalization.initset;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Initset{
    public static void main(String[] args){
        List<String> ls = new ArrayList<>();
        ls.add("A");
        ls.add("B");
        ls.add("A");

        Set<String> ss = new HashSet<>(ls);
        System.out.println("Set Contains: ");
        for(String sl: ss){
            System.out.println(sl);
        }
    }
}