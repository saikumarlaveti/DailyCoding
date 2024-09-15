class ProductOfTwoNumber
{

    public void martixMultiple(int a[][],int b[][]) {
        int c[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args)
    {
    int arr[][] = {{1,3,2},{3,1,1},{1,2,2}};
    int brr[][] = {{2,1,1},{1,0,1},{1,3,1}};
    ProductOfTwoNumber ptn = new ProductOfTwoNumber();
    ptn.martixMultiple(arr,brr);


    }
}