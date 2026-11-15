
import java.util.HashMap;
import java.util.Map;
class MapDemo {
    enum Keys {
        Name, Age;
    }
    public static void main(String[] args) {
        Map<String, Object> h = new HashMap<>();
        h.put("Name", "Mike");
        h.put("Age", 10);

        System.out.println(h);
        System.out.println(h.get("Name"));
    }
}