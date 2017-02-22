#include <stdio.h>
//Say you have an array for which the ith element is the price of a given stock on day i.
//Design an algorithm to find the maximum profit. You may complete as many transactions as you 
//like (ie, buy one and sell one share of the stock multiple times). However, you may not engage
//in multiple transactions at the same time (ie, you must sell the stock before you buy again).


int main(void) {
    int prices[]={40,39,45,44,43};
    int i = 0;
    int total = 0;
    for(i=0; i<(sizeof(prices)/sizeof(prices[0]))-1;i++){
        if(prices[i]<prices[i+1]){
            total = total + (prices[i+1]-prices[i]);
        }
    }
	printf("%d", total);
	return 0;
}

