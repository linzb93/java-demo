
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class StreamDemo {

    public static void main(String[] args) {

        IntStream is = IntStream.builder()
        .add(1)
        .add(2)
        .add(3)
        .build();
        System.out.println(is.max().getAsInt());

        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        
        Stream<Integer> cs = c.stream();
        List<Integer> csList = cs.map(x -> x + 1)
        .collect(Collectors.toList());

        System.out.println(csList.contains(3));
    }
}