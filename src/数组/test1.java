package 数组;

import org.junit.Test;

public class test1 {
    public int test(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
            count++;
            }
            else{
                nums[i-1]=nums[i];
            }
        }
        return nums.length-count;
    }
@Test
    public  void main() {
        int[] myList={1,1,2};
        int a=test(myList);
        System.out.println(a);
    }

}
