#include <stdio.h>

//Given a column title in Excel, return the corresponding column number

int main(void) {
    char column[] = "AAE";
    char columnIndex[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int columnNum = 0;
    int i = 0;
    int j = 0;
    
    //Letters beyond 26
    while(column[i]!= '\0'){
        if(i>0){
            columnNum = columnNum + 26;
        }
        i++;
    }
    
    //Letters under 26
    for(j=0; j<=25;j++){
        if(columnIndex[j]== column[i-1]){
            columnNum = columnNum + j + 1;
        }
    }
    
    printf("%i", columnNum);
	return 0;
}

