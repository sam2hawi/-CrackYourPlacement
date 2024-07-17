class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0,count =0;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            int rem = sum -k;
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
