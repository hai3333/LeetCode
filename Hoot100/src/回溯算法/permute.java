package 回溯算法;

import org.junit.Test;

import java.util.*;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-12-01 21:06
 * @other
 */

/**
* 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 * */
public class permute {
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<List<Integer>> res=new LinkedList();
//        Deque<Integer> path=new ArrayDeque<>();
        List<Integer> path=new LinkedList<>();
        dfs(nums,res,path);
        return  res;


    }
    public void dfs(int [] nums,List<List<Integer>> res,List<Integer> path){
        //判断边界条件
        if(nums.length == path.size()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(path.contains(nums[i]))
                continue;
            path.add(nums[i]);
            dfs(nums,res,path);
            path.remove(path.size()-1);
        }


    }
    @Test
    public void test(){
        int [] nums={1,2,3};
        List<List<Integer>> permute = permute(nums);
        System.out.println(permute);
    }
}
