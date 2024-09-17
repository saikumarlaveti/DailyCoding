public class IdentityMatrix {

    public boolean findIdentityMatrix(int arr[][])
    {
        boolean  res  = true;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(i == j && arr[i][j] != 1)
                {
                    res = false;
                    break;
                }
                if( i != j && arr[i][j] !=0){
                    res = false;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,0,0},{0,1,8},{0,0,1}};
        IdentityMatrix im  = new IdentityMatrix();
      boolean result =   im.findIdentityMatrix(arr);
      if(result)
      {
          System.out.println("Identity Matrix");
      }
        else {
          System.out.println("Not a Identity Matrix");
      }
    }
}
