// Without paasing parameters, display the multiplication table with two variables , one variable for the number , and other for the limit.*/
function multiplicationTable() {
    let num = 5; 
    let limit = 10; 

    console.log(`Multiplication Table for ${num} up to ${limit}:`);
    for (let i = 1; i <= limit; i++) {
        console.log(`${num} x ${i} = ${num * i}`);
    }
}


multiplicationTable();
