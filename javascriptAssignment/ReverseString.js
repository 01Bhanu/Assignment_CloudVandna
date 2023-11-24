var sentence=prompt("Please enter sentence")
//reverse sentence
var reverseSentence = reverseWords(sentence,"");
console.log(reverseSentence)

var result=reverseWords(reverseSentence,"");
console.log(result)

const reverseWords =(string,separator)=>{
    return string.split(separator).reverse().join(separator);
}