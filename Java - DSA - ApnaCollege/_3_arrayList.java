import java.util.*;

public class _3_arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ahmad");
        list.add("Umar");
        list.add("Ali");

        Collections.sort(list);
        System.out.println(list.get(2));
    }
}
