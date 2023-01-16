package 中级算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-11-28 19:19
 * @other
 */
public class item4 {

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0 || strs==null)
            return null;

        HashMap<String,List<String>> list=new HashMap<>();
        for(String s:strs){
            char ch[]=s.toCharArray();
            //对char 数组进行排序
            Arrays.sort(ch);
            String key=String.valueOf(ch);
//            String key=ch.toString();
            if(!list.containsKey(key))
                list.put(key,new ArrayList<>());
            list.get(key).add(s);
        }
        return new ArrayList<>(list.values());
    }
}
