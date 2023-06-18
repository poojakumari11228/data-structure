package DataStructure.List;

import java.util.HashMap;

public class TwoSumsTOTarget {

	   public static int[] twoSum(int[] nums, int target) {
	        
	        HashMap<Integer, Integer> visited = new HashMap<>();
	        int []result = new int[2];
	        
	        for(int i=0; i <nums.length; i ++){
	        
	            if(visited.containsKey(target-nums[i])){
	                result[0] = visited.get(target-nums[i]);
	                result[1] = i;
	                return result;
	                    
	            }else {
	                visited.put(nums[i],i);
	            }
	        } 
	        return result;
	    }
	   
	   public static void main(String []args) {

			int[] num = new int[] { -1, 0, 1, 2, -1, -4 };
			
			   int[] res = twoSum(num, 1);
			   System.out.println(num[res[0]]+", "+ num[res[1]]);


	   }
	

}
