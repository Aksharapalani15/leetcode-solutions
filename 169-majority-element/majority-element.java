class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> s=new HashMap<>();
        for(int x : nums){
            s.put(x,s.getOrDefault(x,0)+1);
            if(s.get(x)>nums.length/2){
                return x;
            }
        }
        return -1;
        
    }
}