package Patterns.Alphabets;

public class Y_alphabet {
    public static void main(String[] args) {
        for(int i = 1;i<=7;i++){
            for(int j = 1;j<=7;j++){
                if( (i == 1 && j == 1) ||
                        (i == 1 && j == 7) || (i == 2 && j == 2) ||
                        (i == 2 && j == 6) || (i ==3 && j == 3 ) ||
                        (i == 3 && j == 5) || (i == 4 && j == 4) ||
                        (i == 5 && j == 4) ||( i == 6 && j == 4 ) ||
                        (i == 7 && j == 4)){
                    System.out.print("*"+" ");
                }
                else
                    System.out.print(" "+ " ");
            }
            System.out.println();
        }
    }
}
