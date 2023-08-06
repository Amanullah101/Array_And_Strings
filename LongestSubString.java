public class LongestSubString{
	

	int longestSubStringHavingOneZero(String s){


		int left = 0;
		int curr = 0;
		int ans = 0;
		for(int right = 0;right<s.length();right++){
			if(s.charAt(right)=='0'){
				curr++;
			}
			while(curr>1){
				if(s.charAt(left)=='0'){
					curr--;
				}
				left++;
			}
			ans = Math.max(ans,right-left+1);
		}
return ans;
	}

	public static void main(String[] arg){
		LongestSubString obj = new LongestSubString();
		int l = obj.longestSubStringHavingOneZero("1101100111");
		System.out.println("the length of the longest substring achievable that contains only 1 is ="+l);
	}
}