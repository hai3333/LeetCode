//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分


import org.junit.Test;

import java.util.ArrayList;

public class offer21 {

    public int[] exchange(int[] nums) {
        int left=0;
        int right= nums.length-1;
        while (left<right){
          while (left<right &&nums[left]%2==1){
              left++;
          }
          while (left<right && nums[right]%2==0){
              right--;
          }
          int temp=0;
          temp=nums[left];
          nums[left]=nums[right];
          nums[right]=temp;
        }
        return nums;
    }
    public int[] exchange2(int[] nums) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            if(nums[i]%2==0){
                list2.add(nums[i]);
            }else {
                list1.add(nums[i]);
            }
        }
        list1.addAll(list2);
        for(int i=0;i<nums.length;i++){
            nums[i]=list1.get(i);

        }

        return nums;

    }

    @Test
    public void test(){
        int num[]=new int[5];
        for(int i=1;i<5;i++){
            num[i]=i;
        }
        int[] exchange = exchange2(num);
        System.out.println(exchange);
    }



}
