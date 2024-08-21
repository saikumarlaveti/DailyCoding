public class lowerTriangleMartix {

    public int[][] lowerTriangle(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i < j) {
                arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        lowerTriangleMartix ltm = new lowerTriangleMartix();
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int res[][] = ltm.lowerTriangle(arr);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
