import java.util.Scanner;

public class Duck {
    public boolean isDuck(int num){
        while(num!=0){
            if(num%10==0){
                return true;
            }
            else{
                num = num/10;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        Duck  dn = new Duck();
       boolean b =  dn.isDuck(value);
       if(b){
           System.out.println("Duck Number");
       }
       else {
           System.out.println("Not a Duck Number");
       }
    }
}
