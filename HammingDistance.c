#include <stdio.h>
//The Hamming distance between two integers
//is the number of positions at which the corresponding bits are different.

int a = 1;
int b = 2;
int hamming = 0;

int main(void) {
	int i=0;
	//bitwise XOR will give difference in bits
	hamming = a^b;
	//for loop that only iterates after a bit difference
	for(i=0; hamming!=0;i++, hamming &=hamming-1){
	    }
	//now just print the iterator
	printf("%d",i);
	return 0;
}

