import java.util.Scanner;

public class Strontio_number {
    public  int  firstNumberRemove(int number){
        int result = number%1000;
        return result;
    }
    public  int  lastNumberRemove(int number){
        int result = number/10;
        return result;
    }
    public void compare(int num){
        int res1 = num%10;
        int res2 = num/10;
        if(res1 == res2){
            System.out.println("Strontio_number");
        }
        else{
            System.out.println("Not a Strontio_number");
        }
    }
    public void strontioNumberMethod2(int num){
        num = (num*2%1000)/10;
        if(num%10 == num/10){
            System.out.println("Strontio Number");
        }
        else{
            System.out.println("Not a Strontio Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four digit value");
        Strontio_number sn = new Strontio_number();
        int value = sc.nextInt();
        if(value>999 && value<10000) {
            int value1 = value * 2;
            int res1 = sn.firstNumberRemove(value1);
            int res2 = sn.lastNumberRemove(res1);
            sn.compare(res2);
            sn.strontioNumberMethod2(value);//method_2
        }
        else{
            System.out.println("You Entered wrong digit");
        }
    }
}
