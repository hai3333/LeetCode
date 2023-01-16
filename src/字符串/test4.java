package 字符串;

import org.junit.Test;

import java.util.HashMap;

/*
* 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。

注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。


* */
public class test4 {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[]t1=t.toCharArray();
        HashMap<Character,Integer> maps=new HashMap<Character,Integer>();
        HashMap<Character,Integer>mapT=new HashMap<Character,Integer>();
        for(char i:s1){
            maps.put(i, maps.getOrDefault(i,0)+1);
        }
        for(char i:t1){
            mapT.put(i, mapT.getOrDefault(i,0)+1);
        }

    return mapT.equals(maps);

    }
    @Test
    public  void test(){
        String s="anagram";
          String      t="nagaram";

        System.out.println(isAnagram(s,t));

    }

}
