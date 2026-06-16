class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> Nums = new HashSet<Integer>();
        for(int num: nums){
            if(Nums.contains(num)){
            return true;

        }
        Nums.add(num);

    }
    return false;
}
}