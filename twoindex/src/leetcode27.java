import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class leetcode27 {
    /*
    *
    * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。

不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-element
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    *
    * */

    public int removeElement(int[] nums, int val){
        if (nums == null || nums.length == 0)
            return 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }



    @Test
    public void test(){
        int[] myList=new int[4];
        myList[0] = 3;
        myList[1] = 2;
        myList[2] = 2;
        myList[3] = 3;
        System.out.println(removeElement(myList, 3));

    }
    @Test
    public void test2(){
        int[] myList=new int[4];
        myList[0] = 3;
        myList[1] = 2;
        myList[2] = 2;
        myList[3] = 3;
    }

}
