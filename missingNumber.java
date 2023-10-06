class Solution {
    public int missingNumber(int[] nums) {
	int toReturn = 0;
	for(int i=0; i<nums.length; i++){
	    toReturn ^= i;
	    toReturn ^= nums[i];
	}
	toReturn ^= nums.length;
        return toReturn;
    }
}
