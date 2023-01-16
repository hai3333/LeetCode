package 排序和搜索;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-12-20 19:26
 * @other
 */
public class item8 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int min = 0;
        int max = matrix[0].length-1;
        while (min < matrix.length && max >= 0) {
            if(matrix[min][max]>target)
                max--;
            else if(matrix[min][max]<target)
                min++;
            else  return true;
        }
        return false;

    }
}
