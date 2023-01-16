import org.junit.Test;

import java.lang.annotation.Target;

public class test1 {
    /**
     *
     * <h1>题目1</h1>
     * <b>给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。</b>
     *
     * 请必须使用时间复杂度为 O(log n) 的算法。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/search-insert-position
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * */

//先写一个二分查找的非递归式
    public int t(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right){

            int index=(left+right)/2;
            if(target<nums[index]){
                right=index;
            }
            if(target>nums[index]){
                left=index;
            }
            else {
                return index;
            }
        }
        return -1;
    }
//二分查找递归式
    public void search(int[] nums, int target){


    }





    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return -1;
    }
    @Test
    public void test(){
        int[] nums={1,2,3,4,5,6};
        int ta=1;
        System.out.println(searchInsert(nums, ta));

    }


}
