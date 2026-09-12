class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i:nums){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }

        }
        while(max%min!=0){
            int remainder=max%min;
            max=min;
            min=remainder;
        }
        return min;
        
    }
}