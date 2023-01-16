package 数组;

import java.util.Scanner;

public class test3 {

    /// 写的什么jb玩意
    public static void rotate1(int[] nums, int k) {
        int size=nums.length;
        int [] nums1=new int[size];
        int K=k;
        for(int i=0;i<nums.length;i++){
          if(k>0) {
              nums1[i] = nums[nums.length-i-1];
              k--;
          }else{
              nums1[i+k]=nums[i-K];

          }
        }
        for(int i=0;i< nums.length;i++) {
            System.out.println(nums1[i]);
        }
    }
    public static void rotate(int[] nums, int k){
        int size=nums.length;
        int [] num1=new int[size];
        int flag=0;
        for(int i=nums.length-k;i<nums.length;i++) {
            num1[flag] = nums[i];
            flag++;
        }
        for(int i=0;i<nums.length-k;i++){
            num1[flag]=nums[i];
            flag++;
        }
        for(int i=0;i< num1.length;i++) {
            nums[i] = num1[i];
        }

    }


    public static void main(String[] args) {
     int [] nums={-1,-100,3,99};
     int k=2;
     rotate(nums,k);
        for(int i=0;i< nums.length;i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
        System.out.println(nums.length);
    }
}
