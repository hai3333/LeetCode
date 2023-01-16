import org.junit.Test;

public class test1 {

    /*
    *
    * 爬楼梯
    * */


    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public int climbStairs2(int n){
        if( n<=2)
            return n;
        int[]num=new int[n+1];
        num[1]=1;
        num[2]=2;
        for (int i=3;i<=n;i++){
            num[i]=num[i-1]+num[i-2];
        }
        return num[n];

    }

    @Test
    public void t(){
        int n=3;
        System.out.println(climbStairs2(n));
    }
}
