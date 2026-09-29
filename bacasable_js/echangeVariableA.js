const prompt = require("prompt-sync")();
let a = parseFloat(prompt("Valeur a ? "));
let b = parseFloat(prompt("Valeur b ?"));
let tmp = a;
a = b;
b = tmp;
console.log(`a= ${a} b= ${b}`);
