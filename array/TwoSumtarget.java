package DataStructure.array;

public class TwoSumtarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		twoSum(new int[] {2,7,11,15}, 9);

	}
	
	  public static int[] twoSum(int[] nums, int target) {

	        int indexes [] = new int[2];

	        for(int i=0,j=nums.length-1; i<nums.length ;i++, j--){

	            if(nums[i]+nums[j]==target)
	            { indexes[0] = i; 
	              indexes[1] = j;
	            break;
	            }

	        }

	        return indexes;
	    }

}
