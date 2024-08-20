public class MartixEqual
{

    public static boolean checkEqual(int arr[][],int brr[][])
    {

        if(arr.length != brr.length)
        {
            return false;
        }
        else
        {
            for(int i = 0;i<arr.length;i++){
                for(int j = 0;j<arr.length;j++){
                    if(arr[i][j] != brr[i][j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int brr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        MartixEqual me = new MartixEqual();
       boolean res =  me.checkEqual(arr,brr);
       if(res)
           System.out.println("Matrix are Same");
       else
           System.out.println("Matrix are not Same");

    }
}
