import jdk.jfr.StackTrace;
import org.junit.Test;

public class LeetCode704 {

    /**
     * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/binary-search
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (nums[mid] > target) {
                right = mid - 1;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] == target) {
                return mid;
            }
            mid = left + (right - left) / 2;

        }
        return -1;


    }

    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        int low = 0;
        int height = x;

        while (height - low > 1) {
            int mid = low + (height - low) / 2;
            if (x / mid < mid) {
                height = mid;
            } else {
                low = mid;
            }

        }
        return low;
    }



    @Test
    public void test() {
        int nums[] = {-1, 0, 3, 5, 9, 12};
        int a = search(nums, 13);
        System.out.println(a);
    }


}
