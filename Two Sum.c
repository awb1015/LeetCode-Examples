#include <stdio.h>
//Two Sum 
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

int givenNums[4] = {2,7,11,15};
int target = 9;
int resultIndex[2] = {0,0};

int main(void) {
    int i = 0;
    int j = 0;
    
    //We iterate through possible sums of numbers checking for a match
    for(i = 0; i<= (sizeof(givenNums)/sizeof(givenNums[0]))-1 ;i++){
        for(j = i+1; j <= (sizeof(givenNums)/sizeof(givenNums[0]))-1; j++){
            if(givenNums[i]+givenNums[j] == target){
                resultIndex[0] = i;
                resultIndex[1] = j;
            }
        }
        
        
    }
    printf("{ %d , %d }", resultIndex[0], resultIndex[1]);
    
	return 0;
}

