package 字符串;

import org.junit.Test;

import java.util.HashMap;

public class test03 {
    public int firstUniqChar(String s) {
        char[] arr=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        //遍历并且计数
        //getOrDefault(k,0) 获取k的value k不存在返回第二个参数 存在的话 返回看k
        for(char k:arr){
            map.put(k,map.getOrDefault(k, 0) + 1);
        }
        //第二次 找到value=1的返回 没有的话返回-1
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                return i;
            }

        }
        return -1;

    }
@Test
    public void test1() {
        String s="leetcode";

        System.out.println(firstUniqChar(s));

    }
}
