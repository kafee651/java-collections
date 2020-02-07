package generalization.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class AllCollection {
    public static void main(String[] args){
        List<Integer> als = new ArrayList<>();
        als.add(1);
        als.add(3);
        als.add(2);
        System.out.println(als.size());
        System.out.println(als.get(0));
        als.sort(null);
        System.out.println(als);
        List<String> alss = new ArrayList<>();
        alss.add("One");
        alss.add("Three");
        alss.add("Four");
        alss.add("Five");
        System.out.println(alss.size());
        System.out.println(alss.get(0));
        alss.sort(null);
        System.out.println(alss);
        List<Integer> lls = new LinkedList<>();
        lls.add(1);
        lls.add(3);
        lls.add(2);
        lls.sort(null);
        System.out.println(lls.size());
        System.out.println(lls.get(0));
        System.out.println(lls);
        Set<Integer> hs = new HashSet<>();
        hs.add(1);
        System.out.println(hs.size());
        System.out.println(hs.contains(1));
        Set<Integer> ts = new TreeSet<>();
        ts.add(1);
        System.out.println(ts.contains(1));
        System.out.println(ts.size());
        
        Set<String> hss = new HashSet<>();
        hss.add("Kafee");
        hss.add("Sunny");
        hss.add("Konain");
        hss.add("Abu");
        hss.add("kafee");
        hss.add("kafee");
        for(String s: hss){
            System.out.println(s);
            
        }
        if(hss.contains("kafee"))
            hss.remove("kafee");
        for(String s: hss){
            System.out.println(s);
        }

        Map<Integer, String> hm = new HashMap<>();
        hm.put(1, "one");
        System.out.println(hm.get(1));
        System.out.println(hm.size());
        System.out.println(hm.get(5));
        Map<Integer, String> tm = new TreeMap<>();
        tm.put(1, "one");
        System.out.println(tm.get(1));
        System.out.println(tm.size());

        
    }
}