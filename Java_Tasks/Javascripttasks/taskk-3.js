// Pass a number, and find if the sum of their digits is an even or odd number
function sumOfDigits(number){
    let sum = 0;
    while(number>0){
        sum += number % 10;
        number=parseInt(number/10);
    }
    console.log(sum);
    
    return sum
}
console.log(sumOfDigits(256)%2==0?"Even":"Odd");

