import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * */



public class offer17 {
    public int[] printNumbers(int n) {

        int result= (int) (Math.pow(10,n)-1);
        int num= result-1;
        int[] list=new int[num];

        for (int i=1;i<result;i++){
            list[ i-1]=  i;
        }
        return list;
    }

    @Test
    public void test1(){
        int[] ints = printNumbers(3);
        System.out.println(ints);
    }
}
