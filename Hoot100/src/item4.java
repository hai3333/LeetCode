import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class item4 {
    /**
     * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
     * <p>
     * 算法的时间复杂度应该为 O(log (m+n)) 。
     */


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }
        list.toArray();
        Arrays.stream(new ArrayList[]{list}).sorted();
        System.out.println(list);

        return 1;
    }
    @Test
    public void test() {
        int num[] = new int[2];
        num[0] = 1;
        num[1] = 3;
        int num1[] = new int[1];
        num1[0] = 2;
        findMedianSortedArrays(num,num1);

    }
    @Test
    public  void man() {
        int i=2;
        while( i<100){
            System.out.println("gy是傻逼");

        }
    }

}
