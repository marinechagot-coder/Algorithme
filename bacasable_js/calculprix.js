const prompt = require("prompt-sync")();
let Pht = parseFloat(prompt("Quel est le prix HT ? "));
let Ttva = parseFloat(prompt("Quel est le taux de TVA?"));
let Tremise = parseFloat(
  prompt("Quel est le pourcentage de remise à appliquer?"),
);
let Mtva = (Pht * Ttva) / 100;
console.log(`Le montant de la TVA est ${Mtva}`);
let Pttc = Pht + Mtva;
console.log(`Le prix TTC est ${Pttc}`);
let Mremise = (Pttc * Tremise) / 100;
console.log(`Le montant e la remise est ${Mremise}`);
let Pfinal = Pttc - Mremise;
console.log(`Le prix final est ${Pfinal}`);
