package 排序和搜索;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-12-20 19:07
 * @other
 */
public class Item6 {
    public int[][] merge(int[][] intervals) {
        List <List> result=new ArrayList<>();
        List<Integer> list=new ArrayList();
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][1]<intervals[i+1][0]){
                list.add(intervals[i][0]);
                list.add(intervals[i+1][1]);
                result.add(list);
                list.clear();
            }else {
                list.add(intervals[i][0]);
                list.add(intervals[i][1]);
                result.add(list);
                list.clear();
            }

        }
    return null;
    }

}
