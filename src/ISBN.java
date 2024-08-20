public class ISBN {
    public void isIsbn(long num)
    {
        int digit = 0;
        int sum = 0;
        long last=0;
        while(num>0){
            num = num/10;
            digit++;
        }
        if(digit == 10){
            for(int i = 1;i<=10;i++){
                last = num%10;
                sum += last *i;
                num/=10;
            }
            int rem = sum%11;
            if(rem == 0){
                System.out.println("ISBN Number");
            }
            else {
                System.out.println("Not a ISBN Number");
            }
        }
        else {
            System.out.println("Not a ISBN Number");
        }

    }
    public static void main(String[] args) {
        ISBN is  = new ISBN();
        is.isIsbn(1259060977);
        is.isIsbn(2121212121);
    }
}
