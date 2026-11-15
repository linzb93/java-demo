
import java.util.HashSet;
import java.util.TreeSet;
class SetDemo {

    public static void main(String[] args) {

        HashSet<String> h = new HashSet<>();
        h.add("Book");
        h.add("Milk");
        h.add("Book");
        System.out.println(h.size());

        TreeSet<Integer> ti = new TreeSet<>();
        ti.add(-4);
        ti.add(-10);
        ti.add(5);
        System.out.println(ti);
    }
}