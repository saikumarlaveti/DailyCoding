public class sumOfEachRowColumn {
    public void sumOfEachRow(int[][] arr)
    {
        int sum ;
        for(int i = 0;i<arr.length;i++){
            sum = 0;
            for(int j = 0;j<arr.length;j++){
                sum += arr[i][j];
            }
            System.out.println("SumOf "+i+" Row "+sum);
        }
    }

    public void sumOfEachColumn(int[][] arr){
        int sum ;
        for(int i = 0;i<arr.length;i++){
            sum  =0;
            for(int j = 0;j<arr.length;j++){
                sum += arr[j][i];
            }
            System.out.println("SumOf "+i +" Column "+ sum);
        }

    }
    public static void main(String[] args) {
        sumOfEachRowColumn ser = new sumOfEachRowColumn();
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        ser.sumOfEachRow(arr);
        ser.sumOfEachColumn(arr);

    }
}
