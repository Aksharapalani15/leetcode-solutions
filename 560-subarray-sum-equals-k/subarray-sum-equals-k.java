class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
     
        int cursum=0;
        int rem=0;
        for(int i=0;i<nums.length;i++){
            cursum+=nums[i];
            rem=cursum-k;
            count+=map.getOrDefault(rem,0);
            map.put(cursum,map.getOrDefault(cursum,0)+1);

        }
        return count;
        
    }
}