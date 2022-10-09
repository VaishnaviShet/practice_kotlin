package logicquestions
//program to find the non repeating characters in string
fun main(){
    val str = "lavaanya14"

    var tempstr = ""

    for(char in str){
        if(!(char in tempstr))
            tempstr+=char
    }
    print(tempstr)
}