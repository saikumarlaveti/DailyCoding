
public class TuesDay
{
    public static void main(String[] args)
    {
        int n = 20;
        for(int i = 2;i<=n;i++){
            int count=0;
            for(int j =2;j<i;j++){
                if(i%j==0){
                    count ++;
                }}
                if(count == 0){
                    System.out.print(i+" ");
                }

        }
    }
}
