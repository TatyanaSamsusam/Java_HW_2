
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.Iterator;


public class hw6 {
    public static void main(String[] args) {
        //1. Объявить и инициализировать множества HashSet hs, LinkedHashSet lhs и TreeSet ts
        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        //2. Добавить в множества по 10 случайных целочисленных ключей.
        for (int i = 0; i < 10; i++) {
            int r = new Random().nextInt(20);
            hs.add(r);
        }
        System.out.println("here is HashSet: "+hs);

        for (int i = 0; i < 10; i++) {
            int r = new Random().nextInt(20);
            lhs.add(r);
        }
        System.out.println("here is LinkedHashSet: "+lhs);

        for (int i = 0; i < 10; i++) {
            int r = new Random().nextInt(20);
            ts.add(r);
        }
        System.out.println("here is TreeSet: "+ts);


        //3. Пройти по множеству hs и, при условии наличия соответствующего ключа в множестве lhs, удалить ключ из hs

        Iterator<Integer> iterHs = hs.iterator();
        List<Integer> removed = new ArrayList<>();
                
        while (iterHs.hasNext()) {
            int element = iterHs.next();
            if(lhs.contains(element)) {
                removed.add(element);
                iterHs.remove();
            }
                       
        }
        System.out.println("---");
        System.out.println("compared hs and lhs, deleted dublicates from hashset: "+hs);

        //4. Пройти по множеству lhs и, при условии отсутствия соответствующего ключа в множестве ts, добавит ключ в ts
        Iterator<Integer> iterlHs = lhs.iterator();
        //List<Integer> added = new ArrayList<>();
        while(iterlHs.hasNext()) {
            int element = iterlHs.next();
            if(ts.contains(element)) {
                System.out.println(); //не поняла, как приказать ему ничего не делать, от безнадеги вывела пустую строку
            } else {
                ts.add(element);
            }
        }
        System.out.println("---");
        System.out.println("compared lhs and ts, added omitted elements from lhs to ts: "+ts);

        //5. Объявить и инициализировать множество TreeSet ts1 с компаратором Integer (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0).
        // Заполнить ts1 15 случайными числами и вывести на печать.

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare (Integer t0, Integer t1) {
                return(t0 % 2) ==0?-1 : ((t1 %2) ==0)?-1 :((t0 % 2) !=0)?1 : ((t1 %2) ==0)?1:0;
            }
        };
        TreeSet<Integer> ts1 = new TreeSet<>(comp);
        for (int i = 0; i < 15; i++) {
            int r = new Random().nextInt(20);
            ts1.add(r);
        }
        System.out.println("below is ts1: ");
        ts1.forEach(n -> System.out.println(n));
}
}
