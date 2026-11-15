
import java.util.ArrayList;
import java.util.Collection;

class LambdaDemo {

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.forEach(item -> System.out.println(item));
    }
}