package AllLoops;

public class PrimeNumber {
   public void forLoop(int end){
       for(int i =2 ;i<=end;i++){
           int count = 0;
           for(int j =2;j<i;j++){
               if(i % j == 0){
                   count++;
               }

           }
           if(count  == 0)
             System.out.print(i+" ");
       }
   }
    //Recursion
    public void isPrime(int end){
        if(end == 1){
            return;
        }
        else{

        }
    }
    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        pn.forLoop(10);
    }
}
