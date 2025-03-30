
const student = {
    id: 249,
    name: "Ravi",
    department: "Computer Science",
    college: "Panimalar University",
    email: "joeravi@example.com",
    address: {
        doorNo: "12A",
        street: "Main Street",
        area: "tvK",
        pincode: "600001"
    },

    
    displayDetails(...props) {
        props.forEach(prop => {
            if (prop in this) console.log(`${prop.charAt(0).toUpperCase() + prop.slice(1)}: ${this[prop]}`);
            else if (prop === 'address') {
                console.log(`Address: ${Object.values(this.address).join(", ")}`);
            }
        });
    }
};

// Displaying full details
console.log("Displaying Full Details:");
student.displayDetails("id", "name", "department", "college", "email");

// Displaying basic details (id, name, email)
console.log("\nDisplaying Basic Details:");
student.displayDetails("id", "name", "email");

// Deleting email and basic details function
delete student.email;

console.log("\nDisplaying Details with Address:");
student.displayDetails("id", "name", "department", "college", "address");
