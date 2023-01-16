package 数组;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test6 {

    public int[] intersect(int[] nums1, int[] nums2){
      Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        List<Integer> list=new ArrayList<Integer>();
        // 先把数组内容遍历添加到map中
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        // 遍历num2 查找有没有相同的值
        for(int i=0;i<nums2.length;i++){
            if(map.getOrDefault(nums2[i],0)>0){
                list.add(nums2[i] );
                map.put(nums2[i],map.get(nums1[i])-1 );
            }
        }
        // 把集合转换成数组
        int [] listArray=new int[list.size()];
        for(int i=0;i<listArray.length;i++){
            listArray[i]=list.get(i);
        }
        return listArray;
    }
    @Test
    public void main(){
        int [] nums1={4,9,5};
        int [] nums2={9,4,9,8,4};
       int []res= intersect(nums1,nums2);

       for(int i:res){
           System.out.print(i);
       }
    }
}
