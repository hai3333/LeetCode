package 排序和搜索;

import org.junit.Test;

import java.util.*;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-12-02 17:00
 * @other
 */
public class Item1 {
    //排序 计数 取值
    public int[] topKFrequent(int[] nums, int k) {
        //先统计每个数字出现的次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        //最小堆
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>();
        for (int key : map.keySet()) {
            priorityQueue.add(new int[]{key, map.get(key)});
            if (priorityQueue.size() > k)
                priorityQueue.poll();
        }

        //把堆中的元素转化为数组
        int[] res = new int[k];
        int index = 0;
        while (!priorityQueue.isEmpty()) {
            res[index++] = priorityQueue.poll()[0];
        }
        return res;
    }

    public int[] topKFrequent2(int[] nums, int k){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1)-map.get(o2);
            }
        });
        for(Integer i:map.keySet()){
            if(queue.size()<k){
                queue.add(i);
            }else if (map.get(i)>map.get(queue.peek())){
                queue.remove();
                queue.add(i);
            }
        }
        int [] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=queue.remove();
        }
        return  res;


    }

    @Test
    public  void test(){
        int [] nums={1,1,1,2,2,3};
        int k=2;
        System.out.println(topKFrequent2(nums, k));
    }

}
