public class item35 {
    public int searchInsert(int[] nums, int target) {
   int right=nums.length-1;
   int left=0;
        int dex=right+left/2;
   while (left<=right){
       if(target==nums[dex]){
           return dex;
       }
       if(target<nums[dex]) {
           right=dex;
       }
       else if(target>nums[dex]){
           left=dex;
       }
   }
    return dex;
    }
}
