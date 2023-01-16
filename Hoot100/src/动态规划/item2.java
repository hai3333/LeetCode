package 动态规划;

import org.junit.Test;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-12-22 20:13
 * @other
 */
public class item2 {
    public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];
        for (int i = 0; i < m; ++i) {
            f[i][0] = 1;
        }
        for (int j = 0; j < n; ++j) {
            f[0][j] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                f[i][j] = f[i - 1][j] + f[i][j - 1];
            }
        }
        return f[m - 1][n - 1];
    }

    @Test
    public void test() {
        System.out.println(uniquePaths(3, 2));

    }

    public int uniquePaths2(int m, int n) {
        int f[][] = new int[m][n];
        //处理边界条件
        for (int i = 0; i < m; i++) {
            f[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            f[0][i]=1;
        }

        //开始计算
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                f[i][j]=f[i-1][j]+f[i][j-1];
            }
        }

    return f[m-1][n-1];
    }


}
