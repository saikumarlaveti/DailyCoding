public class MatrixMul {

    public int[][] multiplecation(int a[][], int b[][]) {
        int crr[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <b.length; j++) {
                for (int k = 0; k < 3; k++) {
                    crr[i][j]  += a[i][k] * b[k][j];
                }
            }
        }
        return crr;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int brr[][] = {{1, 1, 1},{2, 2, 2}, {3, 3, 3}};
        MatrixMul MM = new MatrixMul();
        int res[][] = MM.multiplecation(arr, brr);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
