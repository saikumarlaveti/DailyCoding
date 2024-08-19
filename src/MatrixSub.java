public class MatrixSub {
    public int[][] subtraction(int a[][], int b[][]) {
        int res[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                res[i][j] = a[i][j] - b[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[][] = {{4, 5, 6}, {3, 4, 1}, {1, 2, 3}};
        int brr[][] = {{2, 0, 3}, {2, 3, 1}, {1, 1, 1}};

        MatrixSub ms = new MatrixSub();
        int result[][] = ms.subtraction(arr, brr);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}