#include <stdio.h>
//Determine whether an integer is a palindrome. Do this without extra space.

int main(void) {
    int n = 3;
    //First discount single digits and negative numbers
    if(n<0 || ((n<10)&&(n>0))){
        printf("This is not a palindrome");
        return 0;
        //Return statement here to end the algorithm immediately
    }
    int sum = 0;
    while(n > sum){
        sum = sum*10 + n%10;
        n = n/10;
    }
    //now if the two are the same it is a palindrom, or if one is the same/10
    //then it is a palindrom of odd length
    if(n==sum || sum/10 == n ){
        printf("This is a palindrome");
    }
    else{
        printf("This is not a palindrome");
    }
	return 0;
}

