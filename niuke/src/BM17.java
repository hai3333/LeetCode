import org.junit.Test;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-11-25 16:33
 * @other
 */
public class BM17 {
    public int search(int[] nums, int target) {
        // write code here
        int left = 0;
        int right = nums.length - 1;
        if (nums.length == 0)
            return -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }


    //BM18  二分查找二维数组版    //分解成四个二分查找，评价是不如遍历
    public boolean Find(int target, int[][] array) {
        //控制行数
        int len = array.length-1;
        for (int i = 0; i <=len; i++) {
            int right=array[i].length-1;
            int left=0;
            int []arr=array[i];
            while (left<=right) {
                int mid=(left+right)/2;
                if(arr[mid]==target){
                    return true;
                }
                if(arr[mid]>target){
                    right=mid-1;
                }
                if(arr[mid]<target) {
                    left = mid + 1;
                }

            }
        }
            return false;
    }

    /**
     *
     * person
     * list 转map
     * age 相同放一块
     * 遍历
     * 判断age 是否相等
     *   相等的话添加到value[]中
     *   pull 下拉远程代码
     *   本地解决冲突
     *   再提交 到远端
     *
     *
     * */

    @Test
    public void test(){
    }

}
