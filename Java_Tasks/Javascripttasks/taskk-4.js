const chooseOperation = (operation, num1, num2) => {
    const operations = {
        add: (a, b) => `Sum: ${a + b}`,
        subtract: (a, b) => `Difference: ${a - b}`,
        multiply: (a, b) => `Product: ${a * b}`,
        divide: (a, b) => b !== 0 ? `Quotient: ${a / b}, Remainder: ${a % b}` : "Error: Division by zero!"
    };

    console.log(operations[operation] ? operations[operation](num1, num2) : "Invalid operation!");
};


chooseOperation("add", 10, 5);
chooseOperation("divide", 10, 0);
