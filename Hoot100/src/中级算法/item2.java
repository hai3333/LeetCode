package 中级算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-11-25 22:43
 * @other
 */
public class item2 {
    public void setZeroes(int[][] matrix) {
        List<Integer> list_i=new ArrayList();
        List<Integer> list_j=new ArrayList();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    list_i.add(i);
                    list_j.add(j);
                }
            }
        }
        //开始变为0 行
        for(int i:list_i){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=0;
            }
        }
        //列
        for(int i:list_j){
            for(int j=0;j<matrix.length;j++){
                matrix[j][i]=0;
            }
        }


    }
}
