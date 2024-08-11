import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(85);
        ll.add(75);
        ll.add(65);
        ll.add(55);
        System.out.println(ll);
        ll.pop();
        System.out.println(ll);
        ll.push(40);
        System.out.println(ll);

    }
}
