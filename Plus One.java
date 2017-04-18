//Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
//You may assume the integer do not contain any leading zero, except the number 0 itself.
//The digits are stored such that the most significant digit is at the head of the list.

public int[] plusOne (String[] args)
{
	int[] nums = {1,2,5,5};
	int n = nums.length;
	for(int n-1; n>=0; n--){
	    if(nums[n]==9){
	        nums[i] = 0; 
	    }
	    else{
	        nums[i]++;
	    }
	}
	//Now we work around the possibility that the first digit was a 9 and we now have a leading zero
	if(nums[0]==0){
	    int modifiednums = new int[nums.length+1];
	    modifiednums[0]=1;
	    return modifiednums;
	}
		return nums;
}
