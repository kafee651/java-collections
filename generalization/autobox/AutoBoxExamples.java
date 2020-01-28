package generalization.autobox;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxExamples{
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(new Integer(3));
        Integer iw = (Integer)l.get(0);
        int ival = iw.intValue();
        System.out.println(ival);

        l.add(7);
        iw = (Integer)l.get(1);
        ival = iw;  //auto unboxing
        iw = ival;  //auto boxing
        System.out.println(ival);

    }
}