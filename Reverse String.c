#include <stdio.h>

//Write a function that takes a string as input and returns the string reversed.
//This does not specify that the output must be a string
//For now I have returned concatenated characters.
//Alternatively a char array of the same size as the string can be defined at compile time
//This is then populated in the for() loop

char sampleString[] = {'H','e','l','l','o'};
//char outputString[sizeof(sampleString];

int main(void) {
	// your code goes here
	int i = 0;
	for(i = (sizeof(sampleString)/sizeof(sampleString[0]))-1; i>=0;i--){
	    printf("%c", sampleString[i]);
	    //uncomment next line to also create a new, reversed string
	    //outputString[(sizeof(sampleString)/sizeof(sampleString[0])-1] = sampleString[i];
	}
	return 0;
}

