import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class item169 {
    /*
    * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/majority-element
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    *
    * */
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > nums.length / 2) {
                return m.getKey();
            }
        }
        return 0;

    }

    public int majorityElement2(int[] nums) {
        int count = 0;
        int major = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                major = nums[i];
                count++;
            }
            else {
                if(major==nums[i]){
                    count++;
                }else {
                    count--;
                }
            }
        }
        return major;

    }


        @Test
        public void test () {


            int[] myList = new int[3];
            myList[0] = 6;
            myList[1] = 5;
            myList[2] = 5;
            majorityElement2(myList);

        }

    }
