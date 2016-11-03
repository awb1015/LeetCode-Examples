//Reverse integer
//Given x = 123 return 321
//See https://leetcode.com/problems/reverse-integer/
#include <stdio.h>

int main(void) {
    int neg = 0;
    int x = 123;
    int i;
    int result = 0;
    
	//This sets a negative flag and continues with the absolute value of the number
	if(x < 0){
	    neg = 1;
	    x = abs(x);
	}
	
	while(x!=0){
	    i = x % 10;
	    result = (result * 10) + i;
	    x = x/10;
	}
	
    if(neg == 1){
	    result= result * -1;
	}
	
	printf("Reversed Integer is %d", result);
	return 0;
}

