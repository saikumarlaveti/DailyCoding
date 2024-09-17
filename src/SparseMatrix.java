public class SparseMatrix {
    public void findSparseMatrix(int arr[][])
    {
        int count = 0;
        int rows = arr.length;
        int cols = arr[0].length;
        int length = rows * cols;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++)
            {
                if(arr[i][j] == 0)
                    count++;
            }
            }
        if(count > (length/2)){
            System.out.println("Sparse Matrix");
        }
        else {
            System.out.println("Not a Sparse Matrix");
        }
    }

    public static void main(String[] args)
    {
        int arr[][] = {{4,0,0},{0,5,0},{0,0,6}};
        SparseMatrix spm = new SparseMatrix();
        spm.findSparseMatrix(arr);

    }
}
