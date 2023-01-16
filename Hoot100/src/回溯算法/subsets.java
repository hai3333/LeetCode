package 回溯算法;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-12-01 22:55
 * @other
 */
public class subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new LinkedList<>();
        dfs(nums,res,new LinkedList<>(),0);
        return res;
    }
    public void dfs(int[] nums,List<List<Integer>> res,List<Integer> list,int start){
        //边界条件不需要
        res.add(new ArrayList<>(list));
        System.out.println(res);
        //开始遍历
        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            dfs(nums,res,list,i+1);
            list.remove(list.size()-1);

        }
    }
    @Test
    public void test(){
        int [] nums={1,2,3};
        List<List<Integer>> subsets = subsets(nums);
        System.out.println(subsets);
    }

    public List<List<Integer>> subsets2(int[] nums) {
            LinkedList<List<Integer>> res=new LinkedList();
            dfs2(nums,res,new ArrayList<>(),0);
            return res;
    }
    public void dfs2(int[] nums,List<List<Integer>> res,List<Integer> list,int start){
        res.add(new ArrayList<>(list));
        //遍历节点
        for(int i=start;i< nums.length;i++){
            list.add(nums[i]);
            dfs(nums,res,list,i+1);
            list.remove(list.size()-1);
        }

    }





































}
