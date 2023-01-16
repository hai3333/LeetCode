package 数组;

import org.junit.Test;

import java.util.ArrayList;

public class test5 {
    public Object singleNumber(int nums[]) {
        boolean flag=false;
        int k=0;
       for(int i=0;i<nums.length-1;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]==nums[j])
                   flag = true;

           }if(!flag)
                k= nums[i];

           }
      return k;
       }



    @Test
    public void main(){
        int[] nums={1,2,3,2,3,6,6};
        int a= (int) singleNumber(nums);
        System.out.println(a);
    }
}