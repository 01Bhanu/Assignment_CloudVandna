var inputArr = [];
var lenOfArr = prompt("Enter length of input Array");
for (var i = 0; i < lenOfArr; i++) {
  //Taking Input from user
  inputArr[i] = prompt("Enter Element " + (i + 1));
}
const sortinDecendingOder = [...inputArr].sort((a, b) => (a > b ? -1 : 1));
console.log(sortinDecendingOder);
