#include <stdio.h>

//Given an array of integers, every element appears twice except for one. Find that single one.
//Should use linear run time complexity

int main(void) {
	int listOfNums[]={1,2,3,2,1,4,5,4,3};
	int i = 0;
	int missingNo = 0;
	while(i<(sizeof(listOfNums)/sizeof(listOfNums[0]))){
	    missingNo = missingNo^listOfNums[i];
	    i++;
	}
	printf("%d", missingNo);
	return 0;
}