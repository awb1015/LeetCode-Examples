#include <stdio.h>
//Given an integer, write a function to determine if it is a power of two.

int main(void) {
    int n = 16;
    //Iterative and recusion both use O(logn) run time complexity
    if(n==0){
        printf("Not a power of two");
    }
    else{
        while(n%2==0){
            n = n/2;
        }
        if(n==1){
            printf("This is a power of two");
        }
        else{
            printf("Not a power of two");
        }
    }
	return 0;
}
//Alternatively we can use the recursion
//Bitwise is preferable as the runtime is O(1) however
