public class MatriceAddition {
    public int[][] addition(int a[][], int b[][]) {
        int c[][] = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <=b.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}};

        int b[][] = {{7, 8, 9}, {10, 11, 12}};

        MatriceAddition ma = new MatriceAddition();
        int result[][] = ma.addition(a, b);
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <= b.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}