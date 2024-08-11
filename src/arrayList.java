import java.util.AbstractList;
import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
      ArrayList <Integer> al = new ArrayList<>(); //Creating arrayList

        al.add(1);  // adding element default it added to the last
        al.add(2);
        System.out.println(al);

        //Add the element to the First
        al.addFirst(0);

        //Add the element to the Last
        al.addLast(100);
        System.out.println(al);

        //Get the element
        System.out.println(al.get(2));

        //Contains the element or not
        System.out.println(al.contains(100));

        //GetFirst element
        System.out.println(al.getFirst());
        //GetLast element
        System.out.println(al.getLast());

       al.clear();
        System.out.println(al);
    }
}
