package zk;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-12-26 15:00
 * @other
 */

import org.junit.Test;

/**
 * 在vivo产线上，每位职工随着对手机加工流程认识的熟悉和经验的增加，日产量也会不断攀升。
 * <p>
 * 假设第一天量产1台，接下来2天(即第二、三天)每天量产2件，接下来3天(即第四、五、六天)每天量产3件 ... ...
 * <p>
 * 以此类推，请编程计算出第n天总共可以量产的手机数量。
 */
public class item1 {
    public int func(String str) {
        // Please fill this blan='
        if (str == null || str.equals(""))
            return -1;
        int result_day = Integer.parseInt(str);
        int day = 1;
        int day_num = 1;//日产量
        int num = 1;//当前产量生产天数
        int result = 0;
        while (day <= result_day) {
            for (int i = 0; i < num; i++) {
                result = result + day_num;
                day = day + 1;
                if (day > result_day)
                    break;
            }
            day_num++;
            num++;
        }
        return result;
    }

    /**
     * 现给定任意正整数 n，请寻找并输出最小的正整数 m（m>9），使得 m 的各位（个位、十位、百位 ... ...）之乘积等于n，若不存在则输出 -1。
     * */
    public int func2(String str) {
        // Please fill this blank
        if(str==null|| str.equals(""))
            return Integer.parseInt(null);
        int n= Integer.parseInt(str);
        if(n<10)
            return n+10;
        for(int i=9;i>1;i--){
            if(n%i==0){
                return
            }
        }

    }

    @Test
    public void test() {
        System.out.println(func("11"));
    }

}


