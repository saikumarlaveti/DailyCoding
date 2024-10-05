package AllLoops;

import java.util.Stack;

public class PrintNumbers {
    public void forLoop(int end)
    {
        for(int i = 1;i<=end ;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public void whieLoop(int end)
    {
        int i = 1;
        while(i<=end)
        {
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
    }

    public void doWhile(int end)
    {
        int i = 1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=end);
        System.out.println();
    }

    public void recursion(int i,int end)
    {
              if(end<i)
        {
            return;
        }
        else{
            System.out.print(i+" ");
            recursion(++i,end);
        }
    }

    public void recursion(Stack<Integer> s, int start , int end)
    {
        if(start>=end)
        {
            return;
        }
        else {

            recursion(s,++start,end);
            s.push(start);
        }
 }


    public static void main(String[] args)
    {
        PrintNumbers pn = new PrintNumbers();

        pn.forLoop(10);

        pn.whieLoop(10);

        pn.doWhile(10);
        System.out.println("recursion");
        pn.recursion(1,10);
        Stack<Integer> s = new Stack<>();
        System.out.println();
        System.out.println("stack" );
        pn.recursion(s,0,10);
        while (!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
    }
}
