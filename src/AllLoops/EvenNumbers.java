package AllLoops;

import java.util.Stack;

public class EvenNumbers {
    public void forLoop() {
        for (int i = 1; i <= 10; i++) {
            if(i%2==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public void whileLoop()
    {
        int i = 1;
        while(i<=10) {
            if(i %2==0) {
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();
    }
    public void doWhileLoop()
    {
        int i  = 1;
        do {
                if(i %2==0) {
                    System.out.print(i+" ");
                }
                i++;
        }while(i<=10);
        System.out.println();
    }
    public void recursion(int i)
    {
        if(i<=10) {
            return;
        }
        else {
            if(i%2==0) {
                System.out.print(i+" ");
            }
            recursion(++i);
        }
        System.out.println();
    }
    public void stack()
    {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty()) {
            int element = s.pop();
            if(element %2 ==0) {
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        EvenNumbers en = new EvenNumbers();
        en.forLoop();
        en.whileLoop();
        en.doWhileLoop();
        en.recursion(1);
        en.stack();
    }
}
