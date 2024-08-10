import java.util.Scanner;

public class smith_number {
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
    public static int sumOfFactor(int num){
        int sum = 0;
        for(int i = 2;i<num;i++){
            if(num%i==0) {
                int res = smith_number.findPrime(i);
                sum += smith_number.sumOfDigits(res);
            }
        }
        return sum;
    }
    public static int findPrime(int num){
        for(int i = 2;i<num;i++){
            if(num%2 == 0){
                return 0;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int digitValue =  smith_number.sumOfDigits(num);
        System.out.println(digitValue);
        int factor = smith_number.sumOfFactor(num);
        System.out.println(factor);
        if(digitValue == factor){
            System.out.println("smith_number");
        }
        else {
            System.out.println("not a smith_number");
        }
    }
}
