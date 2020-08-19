package dynamicprogram;

public class Main0334递增的三元子序列 {
	public static void main(String[] args) {
		System.out.println(new Solution344().increasingTriplet(new int[]{1,2,3,4,5}));
	}
}

class Solution344 {
    public boolean increasingTriplet(int[] nums) {
    	if(nums.length == 0)
    		return false;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
			if(nums[i] <= first) {
				first = nums[i];
			} else if(nums[i] <= second){
				second = nums[i];
			}else{
				return true;
			}
		}
        return false;
    }
}