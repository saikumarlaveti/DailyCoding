package Patterns.Numbers;

public class Pattern_3 {
    public static void main(String[] args) {
        int digit = 1;
        for(int i  = 1;i<=10;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j*i + " ");

            }
            System.out.println();
        }
    }
}
