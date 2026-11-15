
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class ListDemo {

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(-2);

        Iterator<Integer> i = c.iterator();
        // while(i.hasNext()) {
        //     Integer item = i.next();
        //     System.out.println(item);
        // }
        i.forEachRemaining(item -> System.out.println(item));
    }
}