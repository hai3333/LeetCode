package 动态规划;

import org.junit.Test;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-12-20 19:39
 * @other
 */
public class item1 {
    public boolean canJump(int[] nums) {
        int max = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i <= max) {
                max = Math.max(max, i + nums[i]);
                if (max >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean canJump2(int[] nums) {
         int max = nums.length;
         int n=0;
         for(int i=0;i<max;i++){
             if(i<=n){
                 n=Math.max(n,i+nums[i]);
             }
             if(n>max-1){
                 return true;
             }
         }
         return false;
    }






























    @Test
    public void test(){
      int []  nums = {2,3,1,1,4};
      canJump(nums);
    }
}
