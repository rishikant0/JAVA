// function calculator(num1, num2, operator) {
//     let result;

//     switch(operator) {
//         case '+':
//             result = num1 + num2;
//             break;
//         case '-':
//             result = num1 - num2;
//             break;
//         case '*':
//             result = num1 * num2;
//             break;
//         case '/':
//             result = num2 !== 0 ? num1 / num2 : "Cannot divide by zero";
//             break;
//         default:
//             result = "Invalid operator";
//     }

//     return result;
// }

// // Example usage:
// let n1 = 10;
// let n2 = 5;
// let op = '*';

// console.log("Result:", calculator(n1, n2, op));







// function factorial(n) {
  
//   if (n === 0 || n === 1) {
//     return 1;
//   }

//   return n * factorial(n - 1);
// }

// // Example usage
// const number = 5;
// console.log("Factorial of ${number} is $"{factorial(number)});



// function fahrenheitToCelsius(fahrenheit) {
//   return (fahrenheit - 32) * 5 / 9;
// }

// // Example usage
// const fahrenheitTemp = 98;
// const celsiusTemp = fahrenheitToCelsius(fahrenheitTemp);
// console.log(${fahrenheitTemp}°F is equal to ${celsiusTemp.toFixed(2)}°C);



document.getElementById("registrationForm").addEventListener("submit", function(e) {
  e.preventDefault(); // Prevent form from submitting

  const name = document.getElementById("name").value.trim();
  const email = document.getElementById("email").value.trim();
  const password = document.getElementById("password").value;

  if (name === "") {
    alert("Name is required.");
    return;
  }

  if (!validateEmail(email)) {
    alert("Please enter a valid email.");
    return;
  }

  if (password.length < 6) {
    alert("Password must be at least 6 characters.");
    return;
  }

  alert("Registration successful!");
});

// Simple email validation
function validateEmail(email) {
  const re = /^[^@\s]+@[^@\s]+\.[^@\s]+$/;
  return re.test(email);
}