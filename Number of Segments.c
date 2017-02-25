#include <stdio.h>
//Count the number of segments in a string, where a segment is 
//defined to be a contiguous sequence of non-space characters.
//We assume we start with a non-space, nothing is outlined in the description
int main(void) {
	char myString[]={'H','e','l','l','o',',',' ', 't','e','s','t'};
	int numOfSegments = 1;
	int i = 0;
	for(i=0; i<sizeof(myString)/sizeof(myString[0]);i++){
	    if(myString[i]==' '){
	        numOfSegments++;
	    }
	}
	printf("The number of segments is: %d", numOfSegments);
	return 0;
}

