package DataStructure.String;


/*Given a string s, find the length of the longest substring without repeating characters.



Example 1:

Input: s = "abcabbbc"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
*/

public class LongestSubStr {

	public static int lengthOfLongestSubstring(String str) {

		int maxCount = 0;
		if (str.length() == 1)
			return 1;

		for (int i = 0; i < str.length(); i++) {
			int counter = 1;
			String subStr = str.charAt(i) + "";
			for (int j = i + 1; j < str.length(); j++) {
				if (subStr.contains(str.charAt(j) + "")) {
					break;
				} else {
					counter++;
					subStr += str.charAt(j) + "";
				}
			}
			if (maxCount < counter)
				maxCount = counter;
		}

		return maxCount;
	}

	public static void main(String[] args) {

		System.out.println(LongestSubStr.lengthOfLongestSubstring(" "));
		System.out.println(LongestSubStr.lengthOfLongestSubstring(""));

		System.out.println(LongestSubStr.lengthOfLongestSubstring("xyzxybbc"));
		System.out.println(LongestSubStr.lengthOfLongestSubstring("pwwkew"));
		System.out.println(LongestSubStr.lengthOfLongestSubstring("bbbbbbb"));

		System.out.println(LongestSubStr.lengthOfLongestSubstring("au"));

	}

}
