import java.util.AbstractList;
import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Hello");
        al.add("Hi");
        al.addFirst("Saikumar");
        al.addLast("Laveti");
        al.add(0,"hello");
        System.out.println(al.get(1));
        System.out.println(al);
    }
}
