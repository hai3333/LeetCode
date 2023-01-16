import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class offer03 {
    public int lengthOfLongestSubstring(String s){
        //创建一个set来保存已经字符
        Set<Character> set=new HashSet<>();
        //定义左节点
        int i=0;
        //定义右节点
        int j=0;
        int max=0;
        for(i=0;i<s.length();i++){
            //如果集合中不存在i 把当前i加入set
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max=Math.max(set.size(),max);
            }else {//存在字符
                //集合中已经存在该字符
                while (set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(s.charAt(i));
            }

        }
        return max;
    }

    public int test(String s){
        //整一个set
        Set<Character> set =new HashSet<>();
        //左窗口
        int i=0;
        //有窗口
        int j=0;
        //最大值
        int max=0;
        for(i=0;i<s.length();i++){
            //如果当前字符在set中不存在的话加入set
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                //求最大值
                max=Math.max(set.size(), max);
            }else{
                //存在的话 删除
                while (set.contains(s.charAt(i))){
                  //从头开始删除 直到把这个数删除
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(s.charAt(i));
            }
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s){
        //不停的遍历 寻找最长的长度
        Set<Character> set=new HashSet();
        int max=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            //如果set不包含该元素
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max=Math.max(set.size(),max);
            }else {
                //需要删除的字符的位置并不确定
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(s.charAt(i));

            }
        }
        return max;
    }
    @Test
    public void test(){
        String s="dvdf";
        System.out.println(lengthOfLongestSubstring2(s));
    }

}
