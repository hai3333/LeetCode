package 数组;

import org.junit.Test;

public class test2 {
    /*
     * c错误 写的什么jb玩意  又不是只买卖一次  要用贪心算法 找到所有上涨的和
     * */
    @Test
    public void maxProfit1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int min = 100;
        int max = 0;
        int minT = 0;
        int maxT = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                minT = i;
            }
            if (prices[i] > max) {
                max = prices[i];
                maxT = i;
            }
        }
        int x = minT < maxT ? maxT : 0;
        //return x;

    }

    @Test
    public void maxProfit() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int count = 0;
        for (int i = 1; i < prices.length; i++) {
            int result = 0;
            if (prices[i] > prices[i - 1]) {
                result = prices[i] - prices[i - 1];
                count = count + result;
            }
        }
        System.out.println(count);
       // return count;

    }
}
