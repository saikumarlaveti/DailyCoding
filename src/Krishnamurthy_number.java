import java.util.Scanner;

class Krishnamurthy_number {

    public  int fact(int num){
            if(num == 1)
            {
                return 1;
            }
            else{
                return (num*fact(num-1));
            }
        }

    public int isKrishnamurthy(int number)
    {
        int sum = 0;
            while(number>0)
            {
                int digit = number%10;
                int value = fact(digit);
                sum += value;
                number /= 10;
            }
            return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
       Krishnamurthy_number kn = new Krishnamurthy_number();
        int result = kn.isKrishnamurthy(value);
        System.out.println("Value "+value);
        System.out.println("Result "+result);
        if(result == value){
            System.out.println("Krishnamurthy number");
        }
        else {
            System.out.println("Not a Krishnamurthy number");
        }
    }
}
