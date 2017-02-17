#include <stdio.h>
//Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num 
//calculate the number of 1's in their binary representation and return them as an array.

//My first attempt at a medium problem. Complexity could probably be improved


int hammingDist(int a){
    int i = 0;
    for(i = 0; a!=0; i++, a&=a-1){
        
    }
    return i;
}

int main(void) {
    int num = 5;
    int bitArray[num+1];
    int i = 1;
    for(i=0; i<=num; i++){
        bitArray[i] = hammingDist(i);
        printf("%d ", bitArray[i]);
    }
	return 0;
}

