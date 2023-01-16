import org.junit.Test;

import java.util.Hashtable;


/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class offer1 {


    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int result[] = new int[2];
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }

        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        Hashtable<Integer, Integer> hashtable = new Hashtable();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            } else {
                hashtable.put(nums[i], i);
            }
        }
        return new int[0];
    }


    @Test
    public void main() {
        int nums[] = new int[]{2, 5, 5, 1, 1};
        int targer = 10;
        int[] ints = twoSum(nums, targer);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }

}
