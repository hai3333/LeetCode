package 数组;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

public class test4 {
    /// 写的jb玩意超时了
    public boolean containsDuplicate1(int[] nums) {
        boolean k=false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]==nums[j])
                    k=true;
            }
        }
        return k;
            }
@Test
    public boolean containsDuplicate(){
    int[] nums={1,2,3,4,1};
        HashSet<Integer> set=new HashSet<Integer>();
        for(int a:nums){
            set.add(a);
        }
        if(set.size()!=nums.length)
            return true;
        else return false;

    }
}
