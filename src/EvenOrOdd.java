public class EvenOrOdd
{
    public void EOO(int arr[][])
    {
        int Even =0,Odd =0;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if (arr[i][j] %2==0)
                    Even++;
                else
                    Odd++;
            }
        }
        System.out.println("Even Number: "+Even);
        System.out.println("Odd Number: "+ Odd);
    }
    public static void main(String[] args)
    {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        EvenOrOdd eo = new EvenOrOdd();
        eo.EOO(arr);

    }
}
