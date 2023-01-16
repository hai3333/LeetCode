package 中级算法;

import org.junit.Test;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-11-28 19:42
 * @other
 */
public class item6 {
    //中心扩散法
    public String longestPalindrome(String s) {
        int maxLen = 0;
        int len = s.length();
        int start = 0;
        for (int i = 0; i < len; ) {
            //当前剩余子串长度小于已找到回文串的长度的话 直接返回
            if (len - i <=maxLen / 2) {
                break;
            }


            int left = i, right = i;
            //处理前后值相等的情况
            while (right < (len-1) && s.charAt(right) == s.charAt(right + 1)) {
                ++right;
            }
            //下次判断的时候
            i = right + 1;
            //判断是否向两边扩充
            while (right < (len - 1) && left > 0 && s.charAt(left-1) == s.charAt(right+1)) {
                ++right;
                --left;
            }
            //判断最大的长度
            if (right - left + 1 > maxLen) {
                start = left;
                maxLen = right - left + 1;
            }

        }
        //返回最长子串
        return s.substring(start, start+maxLen);
    }
    String longestPalindrome2(String s) {
        //边界条件判断
        if (s.length() < 2)
            return s;
        //start表示最长回文串开始的位置，
        //maxLen表示最长回文串的长度
        int start = 0, maxLen = 0;
        int length = s.length();
        for (int i = 0; i < length; ) {
            //如果剩余子串长度小于目前查找到的最长回文子串的长度，直接终止循环
            // （因为即使他是回文子串，也不是最长的，所以直接终止循环，不再判断）
            if (length - i <= maxLen / 2)
                break;
            int left = i, right = i;
            while (right < length - 1 && s.charAt(right + 1) == s.charAt(right))
                ++right; //过滤掉重复的
            //下次在判断的时候从重复的下一个字符开始判断
            i = right + 1;
            //然后往两边判断，找出回文子串的长度
            while (right < length - 1 && left > 0 && s.charAt(right + 1) == s.charAt(left - 1)) {
                ++right;
                --left;
            }
            //保留最长的
            if (right - left + 1 > maxLen) {
                start = left;
                maxLen = right - left + 1;
            }
        }
        //截取回文子串
        return s.substring(start, start + maxLen);
    }
    public String longestPalindrome3(String s){
        int start=0,maxLen=0;
        int length=s.length();
        for(int i=0;i<length;){
            int left=i,right=i;
            //判断如果当剩余的位数小于最长的回文串 退出
            if(length-i<=maxLen/2)
                break;
            //当下一位相等
            while(right<length-1 && s.charAt(right)==s.charAt(right+1)){
                right++;
            }
            //i++
            i=right+1;
            //扩充
            while(right<length-1 && left>0 && s.charAt(right+1)==s.charAt(left-1)){
                right++;
                left--;
            }
            if(maxLen<right-left+1){
                start=left;
                maxLen=right-left+1;
            }
        }
        return s.substring(start,start+maxLen);


    }





    @Test
    public void Test(){
        String s="babad";
        System.out.println(longestPalindrome3(s));
    }

}
