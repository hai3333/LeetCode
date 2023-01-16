package 排序和搜索;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-12-03 22:28
 * @other
 */
public class item4 {
    public int findPeakElement(int[] nums) {
        int left=0,right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<nums[mid+1]){
                left=mid+1;
            }else{
                right=mid;
            }
        }




        return left;
    }
    public int findPeakElement2(int[] nums){
        int erfen = erfen(nums, 0, nums.length - 1);
        return erfen;
    }
    public int erfen(int[] nums,int left,int right){
        int mid=left+(right-left)/2;
        if(left<right){
            if(nums[mid]>nums[mid+1]){
                return erfen(nums,left,mid);
            }else {
                 return erfen(nums,mid+1,right);
            }
        }
        return mid;


    }

}
