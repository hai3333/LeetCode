package 排序和搜索;

import java.util.PriorityQueue;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-12-03 22:14
 * @other
 */
public class item3 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
        }

        for(int i=0;i<nums.length-k;i++){
            pq.remove();
        }
        return pq.poll();

    }

    public int find2(int[] nums, int k){

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
            if(pq.size()>k){
                pq.remove();
            }
        }

        return pq.poll();

    }
}
