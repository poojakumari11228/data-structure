package DataStructure.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSum {

	/*
	 * Given an integer array nums, return all the triplets [nums[i], nums[j],
	 * nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
	 * nums[k] == 0.
	 * 
	 * Notice that the solution set must not contain duplicate triplets.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [-1,0,1,2,-1,-4] Output: [[-1,-1,2],[-1,0,1]] Explanation:
	 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0. nums[1] + nums[2] + nums[4] =
	 * 0 + 1 + (-1) = 0. nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0. The
	 * distinct triplets are [-1,0,1] and [-1,-1,2]. Notice that the order of the
	 * output and the order of the triplets does not matter. Example 2:
	 * 
	 * Input: nums = [0,1,1] Output: [] Explanation: The only possible triplet does
	 * not sum up to 0. Example 3:
	 * 
	 * Input: nums = [0,0,0] Output: [[0,0,0]] Explanation: The only possible
	 * triplet sums up to 0.
	 * 
	 * 
	 * Constraints:
	 * 
	 * 3 <= nums.length <= 3000 -105 <= nums[i] <= 105
	 */

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = 0; k < nums.length; k++) {
					if (i != j & j != k && i != k && (nums[i] + nums[j] + nums[k] == 0)) {
						List<Integer> list = new ArrayList<>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						
						result.forEach(x -> {
//							if(x.containsAll(list))
//								continue;
						});
						
						
							
							result.add(list);
						
					}
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int[] num = new int[] { -1, 0, 1, 2, -1, -4 };

		// System.out.println(new ThreeSum().threeSum(num));

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(-3);

		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(-3);
		list2.add(2);

		List<Integer> list3 = new ArrayList<>();
		list3.add(1);
		list3.add(-2);
		list3.add(2);

		List<List<Integer>> result = new ArrayList<>();
		result.add(list);

		if (result.stream().allMatch(x -> x.containsAll(list2)))
			System.out.println(list);

		List<List<Integer>> l = result.stream().filter(x -> !x.containsAll(list2)).collect(Collectors.toList());
		if(l!=null) {}
		
		result.forEach(x -> x.contains(l));
		
	}

}
