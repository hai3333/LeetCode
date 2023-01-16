/*
* 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。

找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

返回容器可以储存的最大水量。

说明：你不能倾斜容器。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/container-with-most-water
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */


import org.junit.Test;

import java.lang.annotation.Target;

public class Leetcode11 {

    public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int max = 0;
        while (left < right) {
            int temp = Math.min(height[left], height[right]);
            int v = temp * (right - left);
            max=Math.max(v,max);

            if (height[right] > height[left]) {
                left++;
            }else {
                right--;
            }

        }

        return max;
    }

    @Test
    public void test() {
        int[] myList = new int[9];
        //  1,8,6,2,5,4,8,3,7
        myList[0] = 1;
        myList[1] = 8;
        myList[2] = 6;
        myList[3] = 2;
        myList[4] = 5;
        myList[5] = 4;
        myList[6] = 8;
        myList[7] = 3;
        myList[8] = 7;

        int result=maxArea(myList);
        System.out.println(result);
    }

}
