
/*  给定一个段落 (paragraph) 和一个禁用单词列表 (banned)。返回出现次数最多，同时不在禁用列表中的单词。

    题目保证至少有一个词不在禁用列表中，而且答案唯一。

    禁用列表中的单词用小写字母表示，不含标点符号。段落中的单词不区分大小写。答案都是小写字母。

    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/most-common-word
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class day417 {

    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("\\p{Punct}"," ");
        String l = paragraph.toLowerCase();
        String[] list = l.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        for (int i = 0; i < list.length; i++) {
            if(list[i]=="") continue;
            map.put(list[i], map.getOrDefault(list[i], 0) + 1);
        }
        int max = 0;
        String index = "";
        for(String b:banned){
            map1.put(b,1);
        }
        for(String str:list){
            if(!map1.containsKey(str)&&!str.equals("")){
                map.put(str,map.getOrDefault(str,0)+1);
            }
        }

        for (String i : map.keySet()) {
            if ( map.get(i) > max ) {
                max = map.get(i);
                index = i;
            }
        }
        return index;

    }


    @Test
    public void test() {
        String paragraph = new String("Bob hit a ball, the hit BALL flew far after it was hit.");
        String[] banned = new String[1];
        banned[0] = "hit";
        System.out.println(mostCommonWord(paragraph, banned));
    }
}
