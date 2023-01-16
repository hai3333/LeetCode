import org.junit.Test;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;


public class item20 {

    /**
     * 错误解法  没看明白题目的意思
     */
    public boolean isValid(String s) {

            Deque<Character> deque = new LinkedList<>();
            char ch;
            for (int i = 0; i < s.length(); i++) {
                ch = s.charAt(i);
                //碰到左括号，就把相应的右括号入栈
                if (ch == '(') {
                    deque.push(')');
                }else if (ch == '{') {
                    deque.push('}');
                }else if (ch == '[') {
                    deque.push(']');
                } else if (deque.isEmpty() || deque.peek() != ch) {
                    return false;
                }else {//如果是右括号判断是否和栈顶元素匹配
                    deque.pop();
                }
            }
            //最后判断栈中元素是否匹配
            return deque.isEmpty();

    }
    public boolean isValid2(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(Character i:s.toCharArray()){
            if (i == '(') {
                stack.push(')');
            }else if (i == '{') {
                stack.push('}');
            }else if (i == '[') {
                stack.push(']');
            }else if(stack.empty()){
                return false;
            }else if(i!=stack.pop()){
                return false;
            }

        }
        return stack.empty();
    }







    @Test
    public void test() {
        String s = new String("{[]}");
        System.out.println(isValid2(s));
    }
}
