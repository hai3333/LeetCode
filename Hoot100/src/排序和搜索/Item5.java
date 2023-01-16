package 排序和搜索;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-12-20 18:45
 * @other
 */
public class Item5 {
    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0)
            return new int[]{-1, -1};

        int left = 0;
        int right = nums.length - 1;


        while (left <= right) {
            while (left <= right && nums[left] != target) {
                left++;
            }
            while (left <= right && nums[right] != target) {
                right--;
            }
            if (left <= right) {
                return new int[]{left, right};
            }

        }
        return new int[]{-1, -1};

    }

}
