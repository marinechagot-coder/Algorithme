const prompt = require("prompt-sync")();
let a = parseFloat(prompt("Valeur a ? "));
let b = parseFloat(prompt("Valeur b ?"));
[a, b] = [b, a];
console.log(`a= ${a} b= ${b}`);
