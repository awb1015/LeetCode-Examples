public boolean detectCapitals(String word){
    int numCapital = 0;
    for(int i = 0; i<word.length(); i++){
        if(Character.isUpperCase(word.charAt(i)){
            numCaptial++;
        }
    }
    //if there's one capital it must be the first
    if(numCapital == 1){
        return Character.isUpperCase(word.charAt(0));
    }
    
    //Now if there's not one capital it must be either the entire word or none
    return numCapital == word.length() || numCapital == 0 ;
    
}
