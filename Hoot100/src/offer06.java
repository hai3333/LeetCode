/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-12-24 18:40
 * @other
 *
 */


import org.junit.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 *
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */
public class offer06 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i] );
        }
        Collections.sort(list);
        double avg=0;
        DecimalFormat df=new DecimalFormat("0.00000");
        if(list.size()%2!=0){
            avg= Double.parseDouble(df.format((float)list.get(list.size()/2)));
        }else{
            int avg1=list.get(list.size()/2);
            int avg2=list.get(list.size()/2-1);
            avg = Double.parseDouble((df.format((float) (avg1 + avg2) / 2)));
        }
        return avg;
    }
    @Test
    public void test(){
        int a[]=new int[]{1,2};
        int b[]=new int[]{3,4};
        System.out.println(findMedianSortedArrays(a, b));
    }
}
