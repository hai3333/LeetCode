package 字符串;

/*
String   test   =   "ABCD";
  for   (   int   i   =   0;   i   <   test.length();   ++i   )   {
              char   c   =   test.charAt(   i   );
              int   i   =   (int)   c;
              System.out.println(i);
  }


************************

* 大写字母A-Z的ASCII码为：65-90；

小写字母a-z的ASCII码为：97-122；
* */

import org.junit.Test;

import java.util.ArrayList;

public class test5 {
    public boolean isPalindrome(String s) {
        if (s.length() == 0)
            return true;
        int left = 0, right = s.length() - 1;
        while (left < right) {
            //因为题中说了，只考虑字母和数字，所以不是字母和数字的先过滤掉
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;
            //然后把两个字符变为小写，在判断是否一样，如果不一样，直接返回false
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }



    @Test
    public  void test(){
        String s="abcd";
        isPalindrome(s);
    }
}

