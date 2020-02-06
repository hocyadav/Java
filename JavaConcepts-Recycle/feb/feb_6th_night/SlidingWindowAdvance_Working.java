package feb_6th_night;

public class SlidingWindowAdvance_Working {
	public static void main(String[] args) {
		String str = "aacd";
		int k = 2;
		int t = slidingWindow(str, k);
		System.out.println(t);
	}

	private static int slidingWindow(String str, int k) {
		//null check
		if(str == null || str.length() == 0) {
			return 0;
		}
		int[] map = new int[256];//hashmap for character
		int l = 0; // left pointer
		int distinct = 0;
		int maxWindowSize = 0;
		//2 pointer concept : left and right
		for(int r = 0; r < str.length(); r++) {
			if(map[str.charAt(r)] == 0) distinct++;
			map[str.charAt(r)]++;
			
			while(distinct > k) {//always check if distict element is greater than k or not coz we want k distict length
				map[str.charAt(l)]--;//subtrating count as 1 from map
				if(map[str.charAt(l)] == 0) distinct--;//if count for a given char is 0 then distinct cont also reduce
				l++;
			}
			maxWindowSize = Math.max(maxWindowSize, r - l + 1);
		}
		return maxWindowSize;
	}
}
/*
3
 */
