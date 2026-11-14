class Solution {
    public int maxProduct(int[] nums) {
         int min=nums[0];
         int max=nums[0];
         int maxs=nums[0];
         for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            if(curr<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(curr,max*curr);
            min=Math.min(curr,min*curr);
            maxs=Math.max(maxs,max);
         }
         return maxs;
    }
}