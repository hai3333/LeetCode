package 回溯算法;

import org.junit.Test;

import java.util.*;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-12-01 15:19
 * @other
 */

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode.cn/leetbook/read/top-interview-questions-medium/xv8ka1/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */

public class letterCombinations {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<>();
        //空判断
        if (digits == null || digits.isEmpty())
            return res;

        char[][] tab = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
                {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},
                {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        res.add("");
        while (res.peek().length() != digits.length()) {
            String remove = res.poll();//出队
            char[] chars = tab[digits.charAt(remove.length()) - '2'];
            //相当于当前节点的所有子节点
            for (int i = 0; i < chars.length; i++) {
                res.add(remove + chars[i]);//入队
            }
        }
        return res;


    }
    public List<String> letterCombinations2(String digits) {

        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        Deque<Character> path = new ArrayDeque<>();
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        dfs(digits, 0, ans, path, map);
        return ans;




    }
    public void dfs(String digits, int begin, List<String> ans, Deque<Character> path, Map<Character, String> map) {
       if(path.size()==digits.length()){
           StringBuilder stringBuilder=new StringBuilder();
           for(Character character: path){
               stringBuilder.append(character);
           }
           ans.add(stringBuilder.toString());
           return;
       }
       for(int i=begin;i<digits.length();i++){
           String s=map.get(digits.charAt(i));
           for(int j=0;j<s.length();j++){
               path.addLast(s.charAt(j));
               dfs(digits,i+1,ans,path,map);
               path.removeLast();
           }
       }

    }


    public  void dfs2(String digits, int begin, List<String> ans, Deque<Character> path, Map<Character, String> map){
        //边界条件
        if(path.size()==digits.length()){
            StringBuilder stringBuilder=new StringBuilder();
            for(Character character: path){
                stringBuilder.append(character);
            }
            ans.add(stringBuilder.toString());
            return;
        }
        //开始处理节点  控制层数
        for(int i=begin;i<digits.length();i++){
            String s=map.get(digits.charAt(i));
            for(int j=0;j<s.length();j++){
                //找到第一条路径 控制每层的节点
                path.addLast(s.charAt(j));
                //第一条路径开始找下一个节点
                dfs2(digits,i+1,ans,path,map);
                //删除
                path.removeLast();
            }

        }
    }

    public  void dfs3(String digits, int begin, List<String> ans, Deque<Character> path, Map<Character, String> map){
        //边界条件
        if(path.size()==digits.length()){
            StringBuilder stringBuilder=new StringBuilder();
            for(Character character:path){
                stringBuilder.append(character);
            }
            ans.add(stringBuilder.toString());
            return;
        }
        for(int i=begin;i<digits.length();i++){
            String s=map.get(digits.charAt(i));
            for(int j=0;j<digits.length();j++){
                path.addLast(s.charAt(j));
                dfs2(digits,i+1,ans,path,map);
            }
        }
    }


    public List<String> letterCombinations3(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
//        Deque<Character> path = new ArrayDeque<>();
        List<Character> path=new ArrayList<>();
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        dfs4(digits, 0, ans, path, map);
        return ans;

    }
    public  void dfs4(String digits,int start,List<String> ans,List<Character> path,Map<Character,String> map){
        //判断边界条件
        if(path.size()==digits.length()){
            StringBuilder stringBuilder=new StringBuilder();
            for(Character character:path){
                stringBuilder.append(character);
            }
            ans.add(stringBuilder.toString());
            return;
        }
        //便利子节点
        for(int i=start;i<digits.length();i++){
            String s=map.get(digits.charAt(i));
            for(int j=0;j<s.length();j++){
                path.add(s.charAt(j));
                dfs4(digits,i+1,ans,path,map);
                path.remove(path.size()-1);
            }
        }

    }



    @Test
    public void test(){
        String a ="23";
        letterCombinations3(a);

    }


}
