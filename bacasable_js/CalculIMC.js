const prompt = require("prompt-sync")();
let lins = 18.5;
let lsp = 25;
let lob = 30;
let poids = parseFloat(prompt("Quel est le poids? "));
let taille = parseFloat(prompt("Quel est la taille? "));
let imc = poids / (taille * taille);
let msg = "";
if (imc < lins) {
  msg = "Insuffisance";
} else if (imc < lsp) {
  msg = "poids normal";
} else if (imc < lob) {
  msg = "surpoids";
} else {
  msg = "obseité";
}
console.log(`IMC=${imc} ` + msg);
