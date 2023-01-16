import org.junit.Test;

public class item75 {

    /*
     *
     * 0 1 2 排序
     *
     * */
    //冒泡排序  每次循环都要比较当前位置和下一个位置的大小 满足条件的话就交换
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] >= nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i : nums) {
            System.out.print(i + "*****");
        }

    }

    /*
     * 选择排序  每次选择最小或者最大放到对应的位置
     * */
    public void sortColors2(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            int min = 1000000000;
            int flag=-1;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] <= min) {
                    min = nums[j];
                    flag=j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[flag];
            nums[flag] = temp;
        }

        for (int i : nums) {
            System.out.println(i);
        }
    }


    /*
    * 插入排序
    * 前面几个数字排号之后 插入后面的数字 继续排好 继续添加
    *
    * */

    public void sortColors3(int[] nums){
        int temp;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }else {
                    break;
                }
            }
        }
        for (int i : nums) {
            System.out.println(i);
        }


    }

    @Test
    public void test() {
        int[] nums = new int[7];
        nums[0] = 2;
        nums[1] = 0;
        nums[2] = 2;
        nums[3] = 1;
        nums[4] = 1;
        nums[5] = 1;
        nums[6] = 0;
        sortColors3(nums);
    }
}
