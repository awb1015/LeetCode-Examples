#include <stdio.h>
//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

int main(void) {
    int a = 38;
    while(a>9){
        a = a/10 + a%10;
    }
	printf("%d", a);
	return 0;
}

//The follow up asks to use O(1) runtime and no loops/recursions
//The decimal root would instead be
//if(a==0){
//    return 0;
//}
//else if(n%9==0){
//    return 9;
//}
//else{
//    return n%9;
//}