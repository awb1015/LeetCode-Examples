#include <stdio.h>
//A binary watch has 4 LEDs on the top which represent the hours (0-11)
//and the 6 LEDs on the bottom represent the minutes (0-59).
//Each LED represents a zero or one, with the least significant bit on the right.
//Given a non-negative integer n which represents the number of LEDs that are currently on, 
//return all possible times the watch could represent.
void printTime(int h, int m){
        printf("%d:",h);
        if(m<10){
            printf("0");
        }
        printf("%d ", m);
}

//Use a function here to rely on C operating as pass by value
int hammingDist(int a){
    int i =0;
    for(i = 0; a!=0;i++, a&=a-1){
    }
    return i;
}

int main(void) {
	// your code goes here
	int n = 1;
	int i = 0;
	int j = 0;
	//iterate through all times and check when bits==n
	for(i=0; i<12; i++){
	    j = 0;
	    for(j=0; j<60; j++){
	        if(hammingDist(i) + hammingDist(j) == n){
	            printTime(i, j);
	        }
	    }
	}
	return 0;
}
