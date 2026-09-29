const prompt = require("prompt-sync")();
let a = parseFloat(prompt("Valeur a ? "));
let b = parseFloat(prompt("Valeur b ?"));
a = a + b;
b = a - b;
a = a - b;
console.log(`a= ${a} b= ${b}`);
