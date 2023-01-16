import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class offer07 {
/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/letter-combinations-of-a-phone-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */
//    public List<String> letterCombinations(String digits) {
//        //将映射存储在hash中
//        HashMap<String,String> map=new HashMap<>();
//        map.put("1","");
//        map.put("2","abc");
//        map.put("3","def");
//        map.put("4","ghi");
//        map.put("5","jkl");
//        map.put("6","mno");
//        map.put("7","pqrs");
//        map.put("8","tuv");
//        map.put("9","wxyz");
//        //根据digits计算返回值
//       if (digits.length()==0){
//           return new ArrayList<String>();
//       }
//       List<String> list=new ArrayList<>();
//       if(digits.length()==1){
//           String s = map.get(digits);
//           for(int i=0;i<s.length()-1;i++){
//               list.add(String.valueOf(s.charAt(i)));
//           }
//       }
//       //当长度大于1
//       else {
//           //先拆解digits
//           List list1=new ArrayList();
//           for(int i=0;i<digits.length();i++){
//               list1.add(digits.charAt(i));
//           }
//           //拆解完成 取值进行循环
//
//       }
//
//    }
//一个映射表，第二个位置是"abc“,第三个位置是"def"。。。
//这里也可以用map，用数组可以更节省点内存




}
