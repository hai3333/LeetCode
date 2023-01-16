package 数组;
/*
*
* 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。


作者：力扣 (LeetCode)
链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2cv1c/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
* */

import org.junit.Test;

/**
*
 * 判断数组大小  如果长度=且第一位为0 return [0]
 *求的长度 进行循环 到这取值  最后一个值+1 如果大于10 对这个数取余数
 * 进位符号等于1 后面要加进位符号
 * 最后返回数组
 *
*
*
* */
public class test7 {
    public int[] plusOne(int[] digits) {
        int len =digits.length;
        for(int i=len-1;i>=0;i--){
        if(digits[i]!=9){
            digits[i]++;
            return digits;
        }else{
            digits[i]=0;
        }
        }
        int [] temp= new int [digits.length+1];
        temp[0]=1;
        return temp;
        }

        @Test
        public void test () {
            int[] num = {9, 9};
            int[] num2 = plusOne(num);
            for (int i : num2) {
                System.out.println(i);
            }
        }

}

