package 数组;

import org.junit.Test;

public class test8 {
    public void moveZeroes(int[] nums) {

        int a=0;
        int [] num=new int[nums.length];

        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]!=0){
                num[a]=nums[i];
                a++;
            }

        }



        for(int k:num)

    {
        System.out.println(k);
    }


}
    @Test
    public void  main(){
        int [] arr={0,1,0,3,12};
        moveZeroes(arr);
    }
}
