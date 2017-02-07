#include <stdio.h>
//Given an array of integers every number appears twice except for one. Find that single one.
//You are given an API bool isBadVersion(version) which will return whether version is bad. 
//Implement a function to find the first bad version. You should minimize the number of calls to the API.


//Initially a for() loop seems like the obvious choice but it has O(n) run time and API calls. If we check
//from the middle first instead we have O(logn) run time and API calls instead

bool isBadVersion(int version){
    //some undefined API call
}


int main(void) {
	// your code goes here
	int n;
	int end = n;
	int start = 0;
	int middle = 0;
	while(start<end){
	    middle = (end - start)/2  + start;
	    if(!isBadVersion(middle)){
	        start = middle + 1;
	    }
	    else{
	        end = middle;
	    }
	}
	return start;
}

