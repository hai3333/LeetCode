package 中级算法;

import org.junit.Test;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-11-28 21:11
 * @other
 */
public class item7 {
    //定于两个很大的数字 找到最小值  找到第二小的值，最后找到第三
    public boolean increasingTriplet(int[] nums) {
        int firstMin=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;

        for(int i:nums){
            if (i<=firstMin){
                firstMin=i;
            } else if(i<=secondMin ){
                secondMin=i;
            }else{
                return true;
            }
        }
        return false;
    }

    @Test
    public void test(){
        int num[]={5,4,3,2,1};
        System.out.println(increasingTriplet(num));
    }
}
