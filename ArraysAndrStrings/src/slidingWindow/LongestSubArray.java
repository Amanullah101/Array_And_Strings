package slidingWindow;

public class LongestSubArray {

	/*
	 * Given an array of positive integers nums and an integer k, 
	 * find the length of the longest subarray whose sum is less than or equal to k
	 */
	int lenght_of_longest_sub_array(int nums[],int k) {
		int left = 0;
		int curr= 0;
		int ans = 0;
		for(int right = 0; right<nums.length;right++) {
			curr +=nums[right];
			while(curr>k) {
				curr -=nums[left];
				left++;
			}
			ans = Math.max(ans, right-left+1);
		
	}
		return ans;	
	}
	public static void main(String[] arg) {
		
		int nums[] = {3, 1, 2, 7, 4, 2, 1, 1, 5};
		int k = 8;
		LongestSubArray obj = new LongestSubArray();
		int le = obj.lenght_of_longest_sub_array(nums, k);
		System.out.println("Lenght of the longest sub array which sum is less than or equal to 8 is="+le);
		
	}
}
