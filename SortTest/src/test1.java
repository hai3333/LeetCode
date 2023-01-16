import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test1 {

    /**
     * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
     * <p>
     * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
     * <p>
     * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
     * <p>
     * 作者：力扣 (LeetCode)
     * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnumcr/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<Integer>();
        int l1 = 0;
        int l2 = 0;
        while (l1 != m && l2 != n) {
            if (nums1[l1] <= nums2[l2]) {
                list.add(nums1[l1]);
                l1++;
            } else {
                list.add(nums2[l2]);
                l2++;
            }
        }
        if (l1 != m) {
            for (; l1 < m; l1++) {
                list.add(nums1[l1]);
            }
        }
        if (l2 != n) {
            for (; l2 < n; l2++) {
                list.add(nums2[l2]);
            }
        }
        for(int i=0;i<m+n;i++){
            nums1[i]=list.get(i);
        }


    }

    @Test
    public void test() {
        int[] nums1 = new int[6];
        int[] nums2 = new int[3];

        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        nums1[3] = 0;
        nums1[4] = 0;
        nums1[5] = 0;
        nums2[0] = 2;
        nums2[1] = 5;
        nums2[2] = 6;
        merge(nums1, 3, nums2, 3);


    }


}
