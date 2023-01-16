package 回溯算法;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-12-01 21:02
 * @other
 */
public class generateParenthesis {
    public List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();
        dfs(res, n, n, "");
        return res;
    }

    private void dfs(List<String> res, int left, int right, String curStr) {
        if (left == 0 && right == 0) { // 左右括号都不剩余了，说明找到了有效的括号
            res.add(curStr);
            return;
        }
        //左括号只有剩余的时候才可以选，如果左括号的数量已经选完了，是不能再选左括号了。
        //如果选完了左括号我们是还可以选择右括号的。
        if (left < 0)
            return;
        // 如果右括号剩余数量小于左括号剩余的数量，说明之前选择的无效
        if (right > left)
            return;
        //选择左括号
        dfs(res, left - 1, right, curStr + "(");
        //选择右括号
        dfs(res, left, right - 1, curStr + ")");


    }
    private void dfs2(List<String> res, int left, int right, String curStr){
        if(left==0 && right==0){
            res.add(curStr);
            return;
        }
        if(left<0)
            return;
        if(left<right)
            return;
        dfs(res,left-1,right,curStr+"(");
        dfs(res,left,right-1,curStr+")");

    }



    @Test
    public void test(){
        int i=2;
        System.out.println(generateParenthesis(i).toString());
    }
}
