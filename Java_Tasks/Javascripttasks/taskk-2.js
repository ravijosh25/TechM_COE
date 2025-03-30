//Pass a parameter, and display the factors of that parameter in the function
function findFactors(num) {
    console.log(`Factors of ${num}:`);
    for (let i = 1; i <= num; i++) {
        if (num % i === 0) {
            console.log(i);
        }
    }
}
findFactors(24);