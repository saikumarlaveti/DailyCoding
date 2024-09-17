public class Transpose {
    public  void print(int arr[][])
    {
        for(int i = 0;i<arr.length;i++){
            for(int j = 0 ;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void trans(int arr[][])
    {
        int brr[][] = new int[3][3];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                brr[i][j] = arr[j][i];
            }
        }
        Transpose ts = new Transpose();
        System.out.println("After Transpose");
        ts.print(brr);
    }
    public static void main(String[] args)
    {
     int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Transpose ts = new Transpose();
        System.out.println("Before Transpose");
        ts.print(arr);
        ts.trans(arr);

    }
}
