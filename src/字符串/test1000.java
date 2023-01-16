package 字符串;

public class test1000 {
    public static void reverseString(char[] s) {
      for(int i=0;i<s.length/2;i++){
          char a=s[i];
          s[i]=s[s.length-i];
          s[s.length-i]= a;
      }


    }
/*    @Test
    public void t(){
        char [] sb={'H','a','n','n','a','h'};
        reverseString(sb);


    }*/
public static void main(String[] args) {
    char [] sb={'H','a','n','n','a','h'};
    reverseString(sb);

}

}
