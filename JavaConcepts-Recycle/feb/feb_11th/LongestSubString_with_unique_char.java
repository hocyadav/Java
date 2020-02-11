package feb_11th;

import java.util.HashSet;
import java.util.Set;
/**
 * 
 * @author Hariom Yadav | 11-Feb-2020
 *
 */
public class LongestSubString_with_unique_char {

	public static void main(String[] args) {
		String s = "abcabcd";
		System.out.println(longestSubstaring(s));
	}

	private static int longestSubstaring(String s) {
		int longest = 0;
		if(s == null || s.length() == 0) {
			return longest;
		}
		
		//2 pointer
		int l = 0;
		Set<Character> set = new HashSet<>();
		for(int r = 0;r < s.length(); r++) {
			while(set.contains(s.charAt(r))) {
				set.remove(s.charAt(l));
				l++;
			}
			set.add(s.charAt(r));
			longest = Math.max(longest, r - l + 1);
		}
		System.out.println("Set : "+set);
		return longest;//or we can return set size
	}

}
