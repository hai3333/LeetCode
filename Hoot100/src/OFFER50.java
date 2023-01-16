import org.junit.Test;

/**
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 *
 * */

public class OFFER50 {
    public char firstUniqChar(String s) {

        if(s.length()==1){
            return s.charAt(0);
        }

            for(int i=0;i<s.length();i++){
                int flag=-1;
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j)){
                        flag=0;
                        break;
                    }else {
                        flag=1;
                    }
                }
                if (flag==1){
                    return s.charAt(i);
                }
            }
            return ' ';
        }
    @Test
    public void test(){
        String t=new String("aadadaad");

        char c = firstUniqChar(t);
        System.out.println(c);
    }

    @Test
    public  void test2(){
        int a= 2<<2;
        System.out.println(a);
    }
}
