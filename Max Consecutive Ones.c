#include <stdio.h>
//Given a binary array, find the maximum number of consecutive 1s in this array.

int count = 0;
int oldCount = 0;
int myArray[]={1,1,0,1,1,1,0};

int main(void) {
	int i=0;
	for(i=0; i<(sizeof(myArray)/sizeof(myArray[0]));i++){
	    //We rely on product of zero being zero to reset our current count
	    count = (count + myArray[i])*myArray[i];
	    if(count>oldCount){
	        oldCount = count;
	    }
	}
	printf("%d", oldCount);
	return 0;
}

