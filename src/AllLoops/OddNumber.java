package AllLoops;

public class OddNumber {
    public void forLoop(){
        for(int i = 1;i<10;i++){
            if(i%2== 1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public void whileLoop(){
        int i = 1;
        while(i<10){
            if(i%2==1){
            System.out.print(i+" ");
            i++;
            }
        }
    }

    public void doWhileLoop(){
        int i = 1;
        do{
            if(i%2==1){
                System.out.print(i+" ");
                i++;
            }
        }while (i<10);
    }

    public void recursion(int start ,int  end){
        if(start < end){
            return;
        }
        else {
            if(start % 2==1){
                System.out.print(start+" ");
            }
            recursion(++start,end);
        }
    }

    public void stack()
    {
        
    }

    public static void main(String[] args) {

    }
}
