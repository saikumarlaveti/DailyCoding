import java.util.Scanner;

public class BuzzNumber {
    public void isbuzzNumber(int num){
        if(num%7==0 || num%10 == 7)
        {
            System.out.println("Buzz Number");
        }
        else{
            System.out.println("Not a buzz number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        BuzzNumber bz = new BuzzNumber();
        bz.isbuzzNumber(num);
    }
}
